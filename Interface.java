package matrix;
import java.util.Scanner;
interface Human{
	final int JobID=1050;
	void learn(String str);
	void work();
	
}
interface Recruitment{
	void screening(int score);
}
class Programmer implements Human,Recruitment{
	public void learn(String str)
	{
		System.out.println("My trained area: "+str);
	}
	public void screening(int score)
	{
		System.out.println("Test score: "+score);
	}
	public void work()
	{
		System.out.println("Selected to the role development");
	}
}
public class Interface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Programmer trainee=new Programmer();
		System.out.println("Enter your trained area");
		String str=sc.nextLine();
		System.out.println("Enter Test Score");
		int score=sc.nextInt();
		System.out.println("----ABOUT MY PLACEMENT----");
		trainee.learn(str);
		trainee.screening(score);
		trainee.work();
		System.out.println("My Jobs's ID is: "+trainee.JobID);
		sc.close();
		
		
	}
}
