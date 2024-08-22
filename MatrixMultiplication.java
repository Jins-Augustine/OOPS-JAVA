import java.util.Scanner;
public class MatrixMultiplication{
    public static void main(String[] args){
        int i,j,k,r1,c1,r2,c2;
        int [][] a=new int[100][100];
        int [][] b=new int[100][100];
        int [][] c=new int[100][100];
        Scanner sc = new Scanner(System.in);
        do{

        
        
            System.out.println("Enter the number of rows of matrix 1");
            r1=sc.nextInt();
            System.out.println("Enter the number of columsn of matrix 1");
            c1=sc.nextInt();
            System.out.println("Enter the number of rows of matrix 2");
            r2=sc.nextInt();
            System.out.println("Enter thee number of columns of matrix 2");
            c2=sc.nextInt();
            if(c1!=r1){
                {
                    System.out.println("Matrix Multiplication not possible");
        
                }
            }
        }
        while(c1!=r2);
        System.out.println("Enter the elements of matrix 1");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println("enter the value for a["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the elements of matrix 2");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.println("enter the value for b["+i+"]["+j+"]");
                b[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Matrix 1 is");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix Multiplication is");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

        

        



    }
}