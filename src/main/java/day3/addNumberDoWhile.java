package day3;

import java.util.Scanner;

public class addNumberDoWhile {
    static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        boolean flag; //FALSE
        do{
            System.out.println("Enter your Frist number ");
            double num1= SC.nextDouble();

            System.out.println("Enter your seconed number ");
            double num2 = SC.nextDouble();
            double sum= num1+ num2;
            System.out.println("the sum is " +sum);

            System.out.println("would you like to sum other number \n write true if you want to insert anthor number \n if not write false  ");
            flag= SC.nextBoolean();
            if (flag== false ){
                System.out.println(" thank you for using this program");
            }

        }
        while(flag);


    }
}
