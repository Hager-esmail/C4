package day7;

import java.util.Scanner;

public class LinerSearch
{
    Scanner input = new Scanner(System.in);
    String[]fruits ={ " apple", "banana ","orange "};
    String target; //field
    boolean isFound =false;

    void  search()
    {
        System.out.println(" enter your fruit name ");
        target= input.nextLine();
    }
}
