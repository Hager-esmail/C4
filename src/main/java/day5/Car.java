package day5;

public class Car extends Vehicle {

    public Car()
    {

        super(" Opel","Red","2026");
    }
    public void honk()
    {
        System.out.println(" this car have honk");
    }

    @Override
    public void start()
        {
            System.out.println( " car started");
        }
}
