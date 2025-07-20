package com.practice;

public class Syntaxx{
	public static void main(String[] args)
	{
		String name="Shreyash", name1="Shreyash";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(4));
		System.out.println(name.substring(2,7));
		System.out.println(name.replace("yash","a"));
		System.out.println(name.startsWith("Sh"));
		System.out.println(name.endsWith("sh"));
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('s'));
		System.out.println(name.lastIndexOf('s'));
		System.out.println(name.equals("shreyash"));
		System.out.println(name.equalsIgnoreCase("shreyash"));
		if(name.compareTo(name1)==0)
		{
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
	}

} 