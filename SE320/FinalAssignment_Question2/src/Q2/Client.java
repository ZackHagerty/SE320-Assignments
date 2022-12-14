import java.io.*;
import java.net.*;

public class Client implements Runnable {
  private Socket socket;

  public Client(Socket socket) {
    this.socket = socket;
  }

  public void run() {
	  try {
	        BufferedReader in = null;
	        PrintWriter out = null;
	        try {
	            out = new PrintWriter(socket.getOutputStream(), true);
	            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        } catch (UnknownHostException e) {
	            System.err.println("Unknown host: localhost");
	            System.exit(1);
	        } catch (IOException e) {
	            System.err.println("Couldn't get I/O for the connection to localhost");
	            System.exit(1);
	        }
	        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	        String userInput;
	        System.out.println("Enter weight and height: ");
	        while ((userInput = stdIn.readLine()) != null) {
	            out.println(userInput);
	            System.out.println("BMI: " + in.readLine());
	            System.out.println("Enter weight and height: ");
	        }
	        out.close();
	        in.close();
	        stdIn.close();
	        socket.close();
    } catch (IOException e) {
    	System.err.println("Error in connecting to server");
    }
  }
 
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 4021);
    new Thread(new Client(socket)).start();
  }
}