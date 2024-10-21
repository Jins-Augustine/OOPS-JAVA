package matrix;
import java.util.*;
class Table extends Thread{
	public void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
			}
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println("Error"+e.getMessage());
			}
		}
		
	}
}
class MyTab1 extends Thread{
	Table t;
	int n;
	MyTab1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
}
class MyTab2 extends Thread{
	int n;
	Table t;
	MyTab2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
	
}

public class ThreadSync {
	public static void main(String args) {
		Table t=new Table();
		MyTab1 t1=new MyTab1(t);
		MyTab2 t2=new MyTab2(t);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the table you want to print first:");
		t1.n=sc.nextInt();
		System.out.print("Enter the table you want to print second:");
		t2.n=sc.nextInt();
		t1.start();
		t1.start();
		sc.close();
		
	}

}
