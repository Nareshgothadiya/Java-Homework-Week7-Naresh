package javahomeworkweek7naresh;

//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        wapEmplyee();
    }

    public static void wapEmplyee() {

        int employeeId, basicSalary;
        Double hra, ta, da, pf, grossSalary;
        String employeeName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID");
        employeeId = sc.nextInt();

        System.out.println("Enter Employee Name");
        employeeName = sc.next();

        System.out.println("Enter Employee Basic Salary");
        basicSalary = sc.nextInt();

        hra = (basicSalary * 0.1);
        ta = (basicSalary * 0.8);
        da = (basicSalary * 0.9);
        pf = (basicSalary * 0.2);
        grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println("|------------------------- -----|");
        System.out.println("|        Salary Slip            |");
        System.out.println("|-------------------------------|");
        System.out.println("|Employee ID   :" + employeeId + "  |");
        System.out.println("|Employee Name :" + employeeName + "|");
        System.out.println("|-------------------------------|");
        System.out.println("|Basic Salary  :" + basicSalary + " |");
        System.out.println("|HRA 10%       :" + hra + "         |");
        System.out.println("|TA 9%         :" + ta + "          |");
        System.out.println("|Da 8%         :" + da + "          |");
        System.out.println("|PF - 20%      :" + pf + "          |");
        System.out.println("|-------------------------------|");
        System.out.println("|Gross Salary  :" + grossSalary + "|");
        System.out.println("|-------------------------------|");
        sc.close();
    }

}
