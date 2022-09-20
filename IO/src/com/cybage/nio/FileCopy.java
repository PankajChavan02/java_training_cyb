package com.cybage.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//D:\Training
		
		Path source = Paths.get("D:\\Training\\read.txt");
		Path destination = Paths.get("D:\\Training\\dest.txt");
		
		//Files.copy(source,destination);
		
		Files.delete(Paths.get("D:\\Training\\Temp\\dest.txt"));
		
		//Files.move(destination, Paths.get("D:\\Training\\Temp\\dest.txt"),StandardCopyOption.REPLACE_EXISTING);

	}

}
