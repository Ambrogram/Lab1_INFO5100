package edu.neu.mgen.hw14GUI.server;

import java.io.*;
import java.net.*;

public class ChatServer {
    private ServerSocket serverSocket; // Server socket to listen for client connections
    private Socket clientSocket; // Socket representing a client connection
    private PrintWriter out; // Output stream to send data to the client
    private BufferedReader in; // Input stream to receive data from the client

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port); // Create a ServerSocket to listen on the specified port
        clientSocket = serverSocket.accept(); // Accept a connection from a client

        out = new PrintWriter(clientSocket.getOutputStream(), true); // Initialize the output stream
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Initialize the input stream

        String greeting = in.readLine(); // Read data (greeting) from the client
        if ("hello server".equals(greeting)) {
            out.println("hello client"); // Send a response if the greeting is as expected
        } else {
            out.println("unrecognized greeting"); // Send an error response if the greeting is not recognized
        }
    }

    public void stop() throws IOException {
        in.close(); // Close the input stream
        out.close(); // Close the output stream
        clientSocket.close(); // Close the client socket
        serverSocket.close(); // Close the server socket
    }

    public static void main(String[] args) throws IOException {
        ChatServer server = new ChatServer();
        server.start(6666);
    }
}
