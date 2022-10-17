package javahomeworkweek7naresh;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        myMethod();


    }

    public static void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter City Caractor");
        String input = scanner.next();

        switch (input) {
            case "a":
            case "A":
                System.out.println("Adtala");
                break;
            case "b":
            case "B":
                System.out.println("Babra");
                break;
            case "c":
            case "C":
                System.out.println("Chital");
                break;
            case "d":
            case "D":
                System.out.println("Dhasa");
                break;
            case "e":
            case "E":
                System.out.println("Eklera");
                break;
            case "f":
            case "F":
                System.out.println("Fifad");
                break;
            default:
                System.out.println("Invalid City Name");
                scanner.close();
        }

    }

}

