import java.util.Scanner;

public class practiceset2{

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a statement with spaces: ");
		String stmt= sc.nextLine();
		System.out.println(stmt.indexOf("  "));
		System.out.println(stmt.indexOf("   "));
	}
}