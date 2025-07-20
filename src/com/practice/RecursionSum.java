package com.practice;

class RecursionSum{
	public static void main(String[] args)
	{
		System.out.println(giveSum(100));
	}
	
	static int giveSum(int n)
	{
		int sum=0;
		if(n == 1){
			return 1;
		} 
		else
		{
			sum=n+giveSum(n-1);
		}
		return sum;
	}
}
