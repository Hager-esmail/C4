package day3;

import java.util.Scanner;

public class programCashir {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of item ");
        int quantity= sc.nextInt();
        double total=0;
        for( int i=0; i<quantity ;i++)
//       for( int i=1; i<=quantity ;i++)
        {
            System.out.println(i);
            System.out.println("Enter the cost of item");
           double itemprice =sc.nextDouble();
            total+= itemprice; //shorthand operator
        }
        System.out.println("the total perice is " +total);
    }
}
