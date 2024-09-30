package matrix;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String args[]) {    
        Scanner sc = new Scanner(System.in);
        char confirmation;

        do {
            System.out.println("---Enter required operation---");
            System.out.println("1: Arithmetic Operation  2: Array Index Access");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter the number to be divided");
                        int dividend = sc.nextInt(); 
                        System.out.println("Enter the divisor");
                        int divisor = sc.nextInt();
                        int result = dividend/divisor; 
                        System.out.println("RESULT="+result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        int[] array = {2, 4, 6, 8};
                        System.out.println("Enter the index to be accessed");
                        int index = sc.nextInt();
                        System.out.println("Element at index " + index + " is " + array[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.print("Do you want to continue (y or n)? ");
            confirmation = sc.next().charAt(0);
        } while (confirmation == 'y' || confirmation == 'Y');

        sc.close(); 
    }
}
