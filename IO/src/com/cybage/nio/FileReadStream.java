package com.cybage.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadStream {

	public static void main(String[] args) {
		Path srcPath = Paths.get("D:\\Training\\names.txt");
		Path destPath = Paths.get("D:\\Training\\write.txt");
		
		
		
		try( Stream<String> lines = Files.lines(srcPath);){
			List<String> list = lines.
					filter(e->e.length()<5).
					collect(Collectors.toList());	
			list.forEach(System.out::println);
			
			//print in other file
			Files.write(destPath, list);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
