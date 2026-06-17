package day5;

public class Animal {
    //inheritance : allow one class ( child / subclass) to acquire the properties and methods of anothor class (parent/superclass)
    // java dosnot support multi inheritance
    //
    public void eat()
    {
        System.out.println(" thi dog eats food ");
    }

    //  polymorphism) run time => method override
    public void sound()
    {
        System.out.println(" this animal make sound");
    }

}
