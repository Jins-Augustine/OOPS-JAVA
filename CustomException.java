package matrix;
import java.util.Scanner;
class AgeException extends Exception
{
	public AgeException(String message) {
		super(message);
	}
}


public class CustomException {
	public static void ValidateAge(int age)throws AgeException{
		if(age<18)
		{
			throw new AgeException("Age must be at least 18 years");
		}
		System.out.println("Eligible to vote");
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try
		{
			ValidateAge(age);
		}
		catch(AgeException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		finally {
			System.out.println("Im finally block.....Im always here");
		}
		sc.close();
				
	}

}	
