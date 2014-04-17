package echoClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class echoClient {    
    public static void main(String[] args) {
		try {
			Socket st = new Socket("localhost", 8891);
			BufferedReader rd = new BufferedReader(new InputStreamReader(st.getInputStream()));
			PrintWriter wr = new PrintWriter(st.getOutputStream(), true);
			BufferedReader conn = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client End");
            
			String line;
			do {
				line = rd.readLine();
				if ( line != null ) {
					System.out.println(line);
                }
				
				line = conn.readLine();
				wr.println(line);
			} while ( !line.trim().equals("QUIT") );
		}
		
		catch (Exception err) {
			System.err.println(err);
		}
	}   
    
}
