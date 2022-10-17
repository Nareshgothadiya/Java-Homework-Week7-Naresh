package javahomeworkweek7naresh;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry

import java.util.Scanner;
public class Programme8 {

    public static void main(String[] args) {
        Programme8 alphabet = new Programme8();
        alphabet.cityName();
    }
    public void cityName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First letter");
        char city = sc.next().charAt(0);

        if (city == 'a' || city == 'A') {
            System.out.println("Amreli");
        }
        if (city == 'b' || city == 'B') {
            System.out.println("Babra");
        }
        if (city == 'c' || city == 'C') {
            System.out.println("Chital");
        }
        if (city == 'd' || city == 'D') {
            System.out.println("Dhasa");
        }
        if (city == 'e' || city == 'E') {
            System.out.println("Eklera");
        }
        if (city == 'f' || city == 'F') {
            System.out.println("Fifad");
            sc.close();
        }
    }
}




