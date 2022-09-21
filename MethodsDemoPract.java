package org.openqa.selenium;

public class MethodsDemoPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemoPract d=new MethodsDemoPract();
		String name= d.getData();
		System.out.println(name);
		MethodsDemo1 d1=new MethodsDemo1();
		d1.getUserData();
		getData2();
		
	}
		public String getData() 
		{
			System.out.println("Hello World");
			return "rahul shetty";
		}
		public static String getData2()
		{
			System.out.println("Hello All");
			return "rahul shetty";
		}

	}


