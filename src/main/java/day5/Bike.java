package day5;

public class Bike  extends Vehicle{
    public Bike()
    {
        super(" moto" ,"black" , "2020");
    }
    public void ringBall()
    {
        System.out.println(" this bike has a ringBall");
    }

    @Override
    public void start()
    {
        System.out.println( " Bike started");
    }
}
