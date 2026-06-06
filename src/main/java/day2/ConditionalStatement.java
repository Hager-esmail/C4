package day2;

import java.util.Scanner;

public class ConditionalStatement {
    static void main(String[] args) {
        //Scanner allow take inputs from  external source \
//        Scanner sc= new Scanner(System.in);
//        System.out.println(" Enter your age , Please : ");
//      int personAge =  sc.nextInt();
//        System.out.println( "your age is " +personAge   );
//        if(personAge>18){
//            System.out.println("go to vote");
//
//        }
//        else {
//            System.out.println(" you cannot vote ");
//        }

//         String status = personAge>= 18 ? "go to vote " :" can not vote ";
//        System.out.println(" your status is : " +status);


//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Please, Enter you number : ");

//        int num = sc.nextInt();
//        if (num > 0) {
//            System.out.println("the number " + num + " is positive ");
//        } else if (num == 0) {
//            System.out.println("the number is zero");
//
//        } else {
//            System.out.println(" the number " + num + " is negative ");
//        }


//        if (num == 0) {
//            System.out.println("the number is zero");
//
//        } else if (num % 2 == 0) {
//            System.out.println(" your number is even");
//        } else {
//            System.out.println("your number is odd");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please, Enter you number : ");
        int num = sc.nextInt();
        if (num >= 0) {
            if (num == 0)
                System.out.println("the number is zero");
            else if (num % 2 == 0)
            {
                System.out.println(" your number is even");
            }
            else
            {
                System.out.println("your number is odd");
            }

        } else {
            System.out.println(" negative number is not allowed ");
        }
    }
}
