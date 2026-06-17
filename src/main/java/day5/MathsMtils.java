package day5;

public class MathsMtils   {
    //polymorphism => many forms
    // same method name , different parameter list (different signature )
    // decision made at *compile time *\


    //int version
     int add( int a , int b)
     {
         System.out.println(" int  version off add  method is called ");
          return a+b;
     }


// double version
     double add( double a, double b)
     {
         System.out.println(" Double  version off add  method is called ");

         return a+b;
     }
}

