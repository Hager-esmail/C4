package day4;


import java.util.Scanner;

//class =>blueprint , container
public class Rectangle {

    //Encapsulation ==> data hiding  , data protection , data security


    Scanner sc = new Scanner(System.in);
    private double length; //filed
    private double width;

    //    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
    public void setLength(double length) {
        if (length > 0)
            this.length = length; // lenght of method;
        else System.out.println(" length must be positive ");
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.out.println(" this width must be positive ");
    }

    public double getWidth() {
        return width;
    }

    public double calculatorArea() {

        return  length*width;
    }

//   public  void calculatorArea()
//    public  double calculatorArea()
//    {
//        System.out.println(" enter your Length , Please ");
//        length = sc.nextDouble();
//
//        System.out.println(" enter your  Width , Please ");
//        width= sc.nextDouble();
//
//         double area = length * width;
//        System.out.println( " the area of rectangel is : " +area);
//        return area;
//    }
}

