package com.cybage.socketprogramming;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {
	
	public static void serverSocketing(int port) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		DataInputStream in = null;
		DataInputStream chat = null;
		DataOutputStream out = null;
		
		try {
			serverSocket = new ServerSocket(port);
	       System.out.println("server created ");
	   	   socket = serverSocket.accept();
   	   	   System.out.println("client connected");
	
	        in = new DataInputStream(socket.getInputStream());
	        chat=new DataInputStream(new BufferedInputStream(System.in)); 
	        out = new DataOutputStream(socket.getOutputStream());
		
		String chatLines ="";
		String data = "";
		while (true) {
			
			chatLines = chat.readLine();		 
		    out.writeUTF(chatLines);	
		    out.flush();
			
			data = in.readUTF();
			System.out.println("Client : "+data);
			
			if(chatLines.equals("over")) break;
			
			
		}
		//System.out.println("Ended ");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			 
			
			try {
				serverSocket.close();
				socket.close();
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
		
		serverSocketing(5500);

	}

}
