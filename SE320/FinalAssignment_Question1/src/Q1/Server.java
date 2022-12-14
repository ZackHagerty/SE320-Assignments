import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(4020);
		} catch (IOException e) {
			System.err.println("Couldn't listen on server port");
			System.exit(1);
		}
		
		
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("Couldn't connect with client");
			System.exit(1);;
		}
		

		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
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
		clientSocket.close();
		serverSocket.close();
	}
}
