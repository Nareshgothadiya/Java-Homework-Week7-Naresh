package javahomeworkweek7naresh;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Programme2 {

    public static void main(String[] args) {
        int year = 2007;
     //   Scanner leapYear = new Scanner(System.in);
     //   System.out.println("Enter any Year");

        if (year % 400 == 0) {
            System.out.println("This is Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) ;
        System.out.println("This is Not LeapYear");
        {
        }
    }
}
