import java.util.Scanner;
public class frequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        System.out.println("enter the characrer");
        char ch=sc.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.println("count of occurance of " +ch+ " is " +count);
    }
}
