package com.practice;
import java.util.*;

class TowerOfHanoi{
	
	public static void towerOfHanoi(int n, String src, String helper, String dest)
	{
		if(n==1)
		{
			System.out.println("Transfered disk "+ n+ " From "+ src+" To "+dest);
			return;
		}
		towerOfHanoi(n-1, src,dest,helper);
		System.out.println("Transfered disk "+ n+ " From "+ src+" To "+dest);
		towerOfHanoi(n-1,helper, src, dest);
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of disks are there: ");
		int n=sc.nextInt();
		towerOfHanoi(n,"Source","Helperr","Destination");
	}
}