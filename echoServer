package echoMultiThreadServer;

import java.io.*;
import java.net.*;

public class echoServer {
    public static void main(String[] args) {

    	ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8891); 
        }
        catch (IOException e) {
            System.out.println("Could not listen on port: " + 8891 + ", " + e);
            System.exit(1);
        }
        
        while(true) {
           Socket clientSocket = null;
        
           try {
        	   clientSocket = serverSocket.accept();
        	   ThreadedServerHandler serverThread;
        	   serverThread = new ThreadedServerHandler(clientSocket);
        	   //serverThread.setPriority(3);
        	   new Thread(serverThread).start();
        	   //serverThread.start();
           } 
           catch (IOException e) {
        	   System.out.println("Accept failed: " + 8891 + ", " + e);
        	   System.exit(1);
           }         
        }
        
    }

}
