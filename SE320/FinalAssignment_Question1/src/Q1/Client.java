import java.net.*;
import java.io.*;

public class Client {
	
	public static void main(String[] args) throws IOException {
        Socket clientSocket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            clientSocket = new Socket("localhost", 4020);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
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
        clientSocket.close();
    }

}
