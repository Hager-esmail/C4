package dayOne;

public class FirstJavaProgram {

    public static void main(String[] args) {

        System.out.println("hello world");

        // variables
        // string   characters as (text)
       /* String firstName="hager esmail";
        System.out.println(firstName);

        */

        String x ="20";
        String y ="30";
        System.out.println(x+y); //concatenation combining two strings together


        //numbers
        int X =1 ;
        int Y= 2;
        System.out.println(X+Y);
        System.out.println(" sum of x and y is: " +(X+Y)); //problem

        //float
        float v = 12.02f;
        System.out.println(v);

        //double
        double d=55;
        double dd=55.5;
        System.out.println(d);
        System.out.println(dd);


        String fisrtName="Hager";
        String lastName="ismail";
        String fullName = fisrtName + " " +lastName;
        System.out.println(fullName);
        int age= 19;
        String dateOfBirth= "21/1/2003";
        String job=" sw Testing";
        double income=10.5;
        double tax= income *0.15;
        double netSalary= income-tax;

        System.out.println( "hello my name is :" + fullName+
                "\n my age is :" +age +
                "\n my Date Of Birth is " + dateOfBirth +
                "\n my job is "+ job+
                "\n my salary is " +income);

        System.out.printf(
                "hello my name is :%s%n "
                        +" my age is :  %f%n"
                        +" my Date Of Birth is %f%n"
                        +" my job is %s%n"
                       + " my salary is %f%n" ,
                fullName,age,dateOfBirth,job,income );
           //Data Types
        //primitive
        int myInt=100;
        byte myByte=10;
        short myShort=30000;
        Long myLong=100000L;
        float myFloat=10000.0F;
        double myDouble=10000.0;

        //char
        char myChar='h';
        System.out.println(myChar);

        boolean myBool=true ;
        System.out.println(myBool);
        // false=0
        //true=1
      System.out.println("Bool " +  hamada);
     }
     static boolean hamada;

}
