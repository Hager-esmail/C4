package day5;

public class main {
    static void main(String[] args) {
//        person person=new person();
//        person p1=new person("Hager" ,23, 'f');
//        p1.printData();


//    BankAccount b = new BankAccount(100);
//    b.getBalance();//1000
//    b.deposit(500);
//    b.getBalance(); //1500


//        Dog d = new Dog();
//        d.eat();
//        d.bark();


//        Bike b = new Bike();
//        b.start();
//        b.ringBall();
//
//
//        Car c = new Car();
//        c.start();
//        c.honk();


        //polymorphism
//        MathsMtils math = new MathsMtils();
//        math.add(1,3); //int version
//        math.add(2.0,3.3); //double version

//        Dog d = new Dog();
//        d.sound();

        //assigment
        Circle c= new Circle();
        Tringle t =new Tringle();
        square s = new square();

        Shape[] shapes= {new Circle(),new Tringle(),new square()};
        for (Shape shape1 :shapes)
        {
            shape1.draw();
        }


    }

}
