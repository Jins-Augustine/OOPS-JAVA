package matrix;
import java.util.*;
import java.io.*;

public class FIleReadAndWrite{
	public static void main(String[] args) {
		try {
			File obj=new File("Register1.txt");
			obj.createNewFile();
			System.out.println("Register1 .txt created");
			Scanner sc=new Scanner(System.in);
			
			FileWriter fout=new FileWriter(obj);
			System.out.print("Enter your KEAM rank number:");
			int n=sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			sc.close();
			
			FileReader fin=new FileReader("Register1.txt");
			BufferedReader br=new BufferedReader(fin);
			String line;
			System.out.println("Contents of Register1 is");
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		

		}catch(IOException e) {
			System.out.println("Error occured"+e.getMessage());
		}
	}
}
