package javahomeworkweek7naresh;

//Write a program that tells us input value is number or an alphabet or symbol.


import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Programme12 obj = new Programme12();
        obj.myValue();
    }

    public void myValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number or an Alphabet:");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A Alphabet.");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A Disit.");
        } else {
            System.out.println(ch + " is A Special Charcter.");
            sc.close();
        }
    }
}
