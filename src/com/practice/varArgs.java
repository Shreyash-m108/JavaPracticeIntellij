package com.practice;

class varArgs{
	public static void main (String[] args)
	{
		System.out.print(varArg(4,5,45,6,65,65,65,6,56,5,6,56,565,65,6,56,5));
	}
	
	static int varArg(int ...arr)
	{
		int result = 0;
		for(int i:arr){
			result+=i;
		}
		return result;
	}
}