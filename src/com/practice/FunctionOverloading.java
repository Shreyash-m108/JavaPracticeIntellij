package com.practice;

class FunctionOverloading{
	void SayHello(){
		System.out.print("This is hello 1");
	}
	
	void SayHello(int a){
		System.out.println("This is hello2");
	}
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		FunctionOverloading fl = new FunctionOverloading();
		fl.SayHello();
		fl.SayHello(5);
	}
}