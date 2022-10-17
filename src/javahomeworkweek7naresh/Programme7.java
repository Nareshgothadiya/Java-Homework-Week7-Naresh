package javahomeworkweek7naresh;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5%
 */

import java.util.Scanner;

public class Programme7 {

    static String sellersName;

    public static void main(String[] args) {
        double comm = 0.0;
        int rate = 0, salesAmount, salesID, salaryBasic;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales ID");
        salesID = sc.nextInt();
        System.out.println("Enter Seller's Name");
        sellersName = sc.next();
        System.out.println("Enter Salary Basic");
        salaryBasic = sc.nextInt();
        System.out.println("Enter the Sales Amount");
        salesAmount = sc.nextInt();

        if (salesAmount >= 50000) {
            rate = 35;
            comm = salesAmount * 0.35;
        }
        if (salesAmount >= 30000) {
            rate = 20;
            comm = salesAmount * 0.20;
        }
        if (salesAmount >= 20000) {
            rate = 10;
            comm = salesAmount * 0.10;
        }
        if (salesAmount >= 20000) {
            rate = 10;
            comm = salesAmount * 0.10;
        }
        System.out.println("Commission Amount = " + comm);
        System.out.println("Commission rete: " + rate + "%");
        sc.close();
    }
}
