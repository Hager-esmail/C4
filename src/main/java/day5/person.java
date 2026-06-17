package day5;

public class person {
    String name; //global variable /filed default protected
    int age ;
    char gender ;
   //constructor => special method in class that is automatically called when an object is created
    //default constructor
    person() //same as a class name
    {
        System.out.println(" iam a default constructor ");

    }
    //signature
    person(String name , int age , char gender)
    {
        //setter
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void printData()
    {
        //getter
        System.out.println(" my name is " +name+ " i am "+age+ "my gender is " +gender);
    }
}
