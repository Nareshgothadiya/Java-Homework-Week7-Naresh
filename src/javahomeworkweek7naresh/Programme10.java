package javahomeworkweek7naresh;

//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
// find addition, Subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {


        int p1, p2, p3, op;
        Scanner adj = new Scanner(System.in);
        System.out.println("Input the First number");
        p1 = adj.nextInt();
        System.out.println("Input the Second number");
        p2 = adj.nextInt();

        System.out.println("Options Available");
        System.out.println("+. Addition");
        System.out.println("_. Subtraction");
        System.out.println("*. Multiplication");
        System.out.println("/. Division");
        System.out.println("Enter Your Options");
        op = adj.nextInt();
        switch (op) {

            case 1:
                p3 = p1 + p2;
                System.out.println("Addition =" + p3);
                break;
            case 2:
                p3 = p1 - p2;
                System.out.println("Subtraction =" + p3);
                break;
            case 3:
                p3 = p1 * p2;
                System.out.println("Multiplication =" + p3);
                break;
            case 4:
                p3 = p1 / p2;
                System.out.println("Division =" + p3);
                break;
            default:
                System.out.println("You have enter wrong Option");
                adj.close();
        }

    }

}


