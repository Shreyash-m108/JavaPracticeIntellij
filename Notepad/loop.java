import java.util.Scanner;
public class loop{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		byte n=sc.nextByte();
		for (int i=1 ;i<=10; i++)
		{
			System.out.println(n*i);
		}
	}
}