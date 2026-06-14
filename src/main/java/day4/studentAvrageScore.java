package day4;

import java.util.Scanner;

public class studentAvrageScore {
    static void main(String[] args) {
        int numberOfStudent= 3;
        int numberOfCourses=4;

        Scanner sc= new Scanner(System.in);

        //for( int i=0 ; i >numberOfStudent ;i++)
        for( int i=1 ; i  <= numberOfStudent ;i++)

        {
            int total =0;
            for( int j=1 ; j<= numberOfCourses ; j++)
            {
                System.out.println(" enter your score for course " +(j)+ " for student " +(i));
                double score = sc.nextDouble();
                total +=score;
            }
            double avarge = total/ numberOfCourses;
            System.out.println(" the average score of student is " +avarge);
        }
    }
}
