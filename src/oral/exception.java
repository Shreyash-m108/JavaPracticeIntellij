package oral;



public class exception {
    public static void main(String[] args) {
        
		try{
			int a=10, b=0, c=0;
			c=a/b;
			System.out.println(c);
		}catch(Exception a)
		{
			System.out.println(a);
		}
		finally {
			System.out.println("This is finally block");
		}
		
    }	
}

