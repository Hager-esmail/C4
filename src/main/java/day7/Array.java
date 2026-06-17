package day7;

public class Array {
    static void main(String[] args) {
        //Array != normal variable
        // non primitive type

//        int[] arr={1,2,3,4,5,6,7,8,9,10}; //collection of variable in the same data type /
//        System.out.println(arr[5]);
//        // array have a fixed size
//
//        for( int i:arr)
//        {
//            System.out.println(i);
//        }
//
//        for(int i =0 ; i< arr.length; i ++)
//        {
//            System.out.println(arr[i]);
//        }
//        int[] numbers= new int[5];
//        System.out.println(numbers[1]); //0
//
//        numbers[0]=5;
//        System.out.println(numbers[0]);
//
//        numbers[1]=6;
//        System.out.println(numbers[1]);
        String[] students={ "hager" , "habiba","hanen","riham ","mariem"};
        for(int i = 0 ; i<students.length ; i++)
        {
            System.out.println(students[i]);

        }
        students[1]="hana";
        for(int i = 0 ; i<students.length ; i++)
        {
            System.out.println(students[i]);

        }
        System.out.println(students[10]);

   }

}
