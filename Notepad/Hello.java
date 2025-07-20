import java.util.Scanner;

public class Hello{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		sc.nextLine();
		System.out.printf("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Total of two numbers is: "+(a+b));
		System.out.println("Your name is "+name);
		
	}	

}