package com.cybage.socketprogramming;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSocket {
	
@SuppressWarnings("deprecation")
public static void clientSocketing(String host,int port) {
	
	Socket clientSocket = null;
	DataInputStream in = null;
	DataInputStream chat = null;
	DataOutputStream out = null;
	
	try {
		
   	   clientSocket = new Socket(host, port);
	   	   System.out.println("welcome to client side : ");

        in = new DataInputStream(clientSocket.getInputStream());
        chat=new DataInputStream(new BufferedInputStream(System.in)); 
        out = new DataOutputStream(clientSocket.getOutputStream());
	
       
        String chatLines ="";
        String data = "";

        
		while(true) {
			
			
			     data = in.readUTF();
				
			     chatLines = chat.readLine();		 
			    out.writeUTF(chatLines);	
			    out.flush();
			
			if(chatLines.equals("over")) break;
	}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	finally {
	
		try {
			clientSocket.close();		
			in.close();
			out.close();
			chat.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
	}

	public static void main(String[] args) throws IOException {
		
		clientSocketing("127.0.0.1", 5500);

	}

}
