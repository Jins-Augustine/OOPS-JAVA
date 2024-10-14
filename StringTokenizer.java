package matrix;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class StringTokenizerExample {
	public static void main(String[] args) {
				int num,sum=0;
				Scanner br=new Scanner(System.in);
				System.out.print("Enter the integers with one space gap");
				String input=br.nextLine();
				StringTokenizer token=new StringTokenizer(input," ");
				while(token.hasMoreTokens()) {
						String a=token.nextToken();
					num=Integer.parseInt(a);
					System.out.println(num);
					sum+=num;
				
				}
				System.out.println("sum:"+sum);
			
			}	
}

