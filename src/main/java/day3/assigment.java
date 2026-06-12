package day3;

import java.util.Scanner;

public class assigment {
    static void main(String[] args) {
        //print 1 to 10
       int number=10;
       for(int i=1;i<=10 ;i++){
           System.out.println(i);
       }
       //print hello massage 10 times
       for (int i=0 ; i<10 ;i++){
           System.out.println("hello massage ");
       }

       //print  only even number between  1 to 10
//        System.out.println("enter your number ,please ");
//        Scanner sc= new Scanner(System.in);
//       int num=sc.nextInt();
       for (int i =1; i<=10 ; i++){
           if(i%2==0){
               System.out.println(i);
           }
//           else {
//               System.out.println("this number is odd");
//           }
       }
       //anthor soulation
        for ( int i=2 ;i<=10;i+=2){
            System.out.println(i);
        }

     // print 10 to 1
        for (int i=10 ; i>0 ;i--){
            System.out.println(i);
        }

        // from 1 to 10 even or odd
        for (int i =1; i<=10 ; i++){
            if(i%2==0) {
                System.out.println(i + " is even");
            }
            else {
                System.out.println(i + " is odd");

            }
        }
    }
}
