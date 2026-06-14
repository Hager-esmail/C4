package day4;

import java.util.Scanner;

public class letterSearch {
    static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println(" enter your full name : ");
        String fullName= sc.nextLine();

        boolean latterFound= false;
        for (int i=0 ; i<fullName.length() ; i++)
        {
             char cuurentLatter= fullName.charAt(i);
            if(cuurentLatter=='a' || cuurentLatter=='A')
            {
                latterFound=true;
                break;
            }
        }
        if (latterFound)//take last value of latterfound

            System.out.println("This name contain latter A");
        else
            System.out.println(" this name dosent contaion latter  A ");



    }
}
