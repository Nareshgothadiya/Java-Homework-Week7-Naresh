package javahomeworkweek7naresh;

//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;


public class Programme16 {

    public static void main(String[] args) {
        Programme16 number = new Programme16();
        number.myMethod();
    }

    public void myMethod() {

        int number = 20;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Nagative");
        } else {
            System.out.println("Zero");
        }

    }
}