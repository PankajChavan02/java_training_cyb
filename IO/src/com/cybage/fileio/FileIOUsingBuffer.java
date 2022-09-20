package com.cybage.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

public class FileIOUsingBuffer {

	public static void main(String[] args) {
		
		String line = null;
		
		///file read 
		try(BufferedReader bufferReader = new BufferedReader(new FileReader("D:\\Training\\read.txt"))){
			
				
				//file write operation
				try( BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("D:\\Training\\write.txt"))
						){
					
					while((line = bufferReader.readLine())!=null) {
					bufferWriter.write(line+"\n");
					System.out.println(line);
					}
					
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			
			
		} catch(IOException e){
			System.out.println(e.getMessage());
		}

	}

}
