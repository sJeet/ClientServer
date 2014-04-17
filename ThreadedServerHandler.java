package echoMultiThreadServer;

import java.io.*;
import java.net.*;

class ThreadedServerHandler  implements Runnable {
    ThreadedServerHandler (Socket client) {
        clientSocket = client;
    }

    public void run() {
    	try {
    		BufferedReader in; 
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
            PrintWriter out;
            
            out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream())); 

            out.println("Write message over here.."); 
            out.flush(); 

            for (;;) {
            	String str = in.readLine(); 
                if (str == null) {
                	break; 
                }
                else {
                	out.println("Echo: " + str);  
                    out.flush();
                    System.out.println("Input [" + str+"]");
                    
                    if (str.trim().equals("QUIT")) {
                            break;
                    } 
                    
                }
                  
            }
            
    	}
        
    	catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    	
        System.out.println("Multi Threaded Server stopped.");
        
    }
    
    private
    Socket clientSocket;
    
}
