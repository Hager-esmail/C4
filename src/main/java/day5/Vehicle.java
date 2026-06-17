package day5;

public class Vehicle {

     String brand;
     String color;
     String year;

     public Vehicle(String brand, String color, String year)
     {
         //setter
         this.brand= brand;
         this.color=color;
         this.year= year;

         System.out.println("this brand is " +brand+ " the color is "+color+ " the year is " +year);
     }
    public  void start()
    {
        System.out.println( " Vehicle  started ");

    }

    //    private String brand;
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    private int year;

}
