package day2;

public class Operators {
    static void main(String[] args) {
//        int x = 20;
//        int y = 20;
//        System.out.println( x==y); //true
//        System.out.println(x !=y ); //false

//        int x = 10;
//        int y = 20;
//        System.out.println( x==y); //false
//        System.out.println(x !=y ); //true
//        System.out.println( x=y ); //x=20
//        System.out.println("x = " +x); //x=20
//        System.out.println( x==y); // true
//
//        double a = 15.0;
//        int b = 15;
//        System.out.println( a==b); // true  //problem
//        System.out.println(a != b); // false
//
//
//        int a = 25;
//        System.out.println( a); // 25
//        int b = 25;
//        System.out.println( a+b); //50
//        a= a+5; //30
//        a += 5; //short hand assigenmet a= a+5 // 30 new 35
//        System.out.println( a);
//
//         a= a-5;
//         a-= 5;
//        System.out.println(a);
//
//        a= a*5;
//        a*= 5;
//        System.out.println(a);
//
////        a = a/5;
////        a /= 5;
////        System.out.println(a);
////        System.out.println( " the div of a %d%n" ,+(a)); //problem
//
//
//        int x = 15;
//        int y =3;
//        System.out.println( x%y );


  //relational operation Binary
//        int a = 7;
//        int b =5;
//        int c =7;
//        int d = 7;
////        System.out.println(a>b);//t
////        System.out.println(a<b); //f
////        System.out.println(a==b); //f
////        System.out.println(a>=b); //t
////        System.out.println(a<=b);//f
//
//
//        //logical operators binary unary\
//        Boolean v1= true;
//        Boolean v2 = false;
//        System.out.println(v1&& v2); //AND //false
//        System.out.println(v1||v2); //OR // True
//            System.out.println(a>b && b<c); // t
//            System.out.println(a>b && b>c); // f
//            System.out.println(a<b || d>a  ); // f
//            System.out.println(a<=b || d>=a); // t
//
//        int adabi=20;
//        int almi=30;
//        boolean tamioz= true ;
//
//        if(adabi >= almi || tamioz){
//                System.out.println( "edkhl adabi");
//        }
//        else{
//                System.out.println("edkhl almi");
//        }

        // increment and decrement operators
             int num = 10;
            System.out.println(num++); //10 //post increment
            System.out.println(num);//11
            System.out.println(++num);//12 //pre increment

            int number=5;
            System.out.println(number++);//5
            System.out.println(number);//6
            System.out.println(++number);//7

            //ternary operators
            int a=18 , b=10 ,c ;
            c = (a>b) ?a:b ; // if a>b  (t)then c = a else (f) c=b
            System.out.println(c);

//            if(a>b){
//                    c=a;
//            }
//            else{
//                    c=b;
//            }


    }
}
