package day3;

import java.util.Scanner;

public class employeeGrossPay {
    static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int hourRate = 15; // fixed value
        int weeklyWorkingHour= 40;
        System.out.println("enter your weekly working hours");
        double employeeWorkingHours= sc.nextDouble();
        while( employeeWorkingHours> weeklyWorkingHour || employeeWorkingHours<=0)
        {
            System.out.println(" invalid entry ,please enter value between 1 to 40 ");
            System.out.println("enter your weekly working hours");
            employeeWorkingHours= sc.nextDouble();
          // break; // bug



        }
        double Salary= employeeWorkingHours * hourRate ;
        System.out.println( " ypur weekly gross salary is " +Salary +"$");


    }
}
