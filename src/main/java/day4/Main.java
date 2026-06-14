package day4;

public class Main {
    static void main(String[] args) {
//         Sum s = new Sum();  // name of class take an object from the class
//          s.sum2Numbers(4,6);
//          s.sum2Numbers(22,44);


//          Rectangle r =new Rectangle();
////          r.calculatorArea();
//          double x= r.calculatorArea();
//        System.out.println("the value of x is " +x);


        Rectangle r = new Rectangle();
        r.setLength(3.3);
        r.setWidth(2.2);
        double areaOfRoom1 = r.calculatorArea();
        System.out.println(" the area of room  1 is : " +areaOfRoom1);

        Rectangle r2= new Rectangle();
        r2.setLength(1.1);
        r2.setWidth(5.5);
        double areaOfRoom2= r2.calculatorArea();
        System.out.println(" the area of room2 is : " +areaOfRoom2);

        double totalOfRoom = areaOfRoom1+areaOfRoom2;
        System.out.println(" the total area of rooms : " +totalOfRoom );
    }
}
