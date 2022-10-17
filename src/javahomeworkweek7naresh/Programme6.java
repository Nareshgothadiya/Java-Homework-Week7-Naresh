package javahomeworkweek7naresh;

//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {

        int number;
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();

        if (number % 2 == 0)

            System.out.println(number + " is Even Number");
        else
            System.out.println(number + " is Odd Number");
        sc.close();
    }
}



