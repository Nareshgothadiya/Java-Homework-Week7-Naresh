package javahomeworkweek7naresh;

//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)


import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        Scanner ternary = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = ternary.nextInt();

        String oddEven = (number % 2 == 0) ? "Odd " : "Even";
        System.out.println(number + " is " + oddEven);
        ternary.close();
    }
}
