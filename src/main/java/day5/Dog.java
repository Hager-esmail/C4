package day5;

public class Dog extends Animal  {

    public void bark()
    {
        System.out.println("this animal barks");
    }


 //   @Override // this tells java , we will overrid a method from the parent classs
//    public void eat()
//    {
//        System.out.println("this dogs eats bones ");
//    }
    @Override
    public void sound()
    {
        System.out.println(" the dog barks ");
    }

}
