import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started. Waiting for a client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Thread to read messages from the client
            new Thread(() -> {
                String clientMessage;
                try {
                    while ((clientMessage = input.readLine()) != null) {
                        System.out.println("Client: " + clientMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            }).start();

            // Main thread sends messages to the client
            String msgToClient;
            while ((msgToClient = userInput.readLine()) != null) {
                output.println(msgToClient);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

			
