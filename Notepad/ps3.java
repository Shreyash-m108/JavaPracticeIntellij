import java.util.Scanner;
public class ps3{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sub1=0,sub2=0,sub3=0,tot=0;
		System.out.println("Enter sub1: ");
		sub1=sc.nextInt();
		System.out.println("Enter sub2: ");
		sub2=sc.nextInt();
		System.out.println("Enter sub3: ");
		sub3=sc.nextInt();
		tot=sub1+sub2+sub3;
		
		if(sub1>=33&&sub2>=33&&sub3>=33&&tot>=40)
		{
			System.out.println("Pass");	
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}