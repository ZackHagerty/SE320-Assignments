import java.io.*;
import java.net.*;

public class Server implements Runnable {
  private Socket socket;

  public Server(Socket socket) {
    this.socket = socket;
  }

  public void run() {
    try {

		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        String inputLine;
        while((inputLine = in.readLine()) != null) {
		String[] input = inputLine.split(" ");
		double kilogramWeight = Double.parseDouble(input[0]);
		double meterHeight = Double.parseDouble(input[1]);
		
		double bmi = kilogramWeight / (meterHeight * meterHeight);
			
		out.println(bmi);
        }
		out.close();
		in.close();
		socket.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(4021);

    while (true) {
      Socket socket = serverSocket.accept();
      new Thread(new Server(socket)).start();
    }
  }
}