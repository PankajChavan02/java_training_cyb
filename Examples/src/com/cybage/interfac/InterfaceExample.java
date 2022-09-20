package com.cybage.interfac;

interface Fly {
	public void flying();
}

class Birds implements Fly{

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println("Inside Birds class ");
		
	}
	
}


class Airplanes implements Fly{

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println("Inside Airplanes class ");
		
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {
		
		Fly fly = new Birds();
		fly.flying();
		fly = new Airplanes();
		fly.flying();

	}

}
