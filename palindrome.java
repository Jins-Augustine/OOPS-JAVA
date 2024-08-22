import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        int flag=0;
        int len=s1.length();
        for(int i=0;i<len/2;i++)
        {
            if(s1.charAt(i)==s1.charAt(len-i-1))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindome");
        }    
        
    }
    
}