package com.cybage.fileio;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentIoTest {	

	public static void main(String[] args) {
		
		Student student1 = new Student("rohit", 5, "5A", "Pune");
		
		//write
	/*	try(ObjectOutputStream objectOutStream = new ObjectOutputStream(new FileOutputStream("D:\\Training\\student.txt"))
				){
			objectOutStream.writeObject(student1);
			objectOutStream.writeObject(new Student("mohit",6,"5B","Thane"));
			objectOutStream.writeObject(new Student("amita",6,"7B","Thane"));
			objectOutStream.writeObject(new Student("narendra",6,"5B","Thane"));
			objectOutStream.writeObject(new Student("anil",6,"6B","Thane"));
			System.out.println("Done");
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		//read
		try(ObjectInputStream objectInStream = new ObjectInputStream(new FileInputStream("D:\\Training\\student.txt"))
				){
			Student student; 
			
			
			while((student= (Student) objectInStream.readObject())!=null) {
				System.out.println(student);
			}
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
