package javahomeworkweek7naresh;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
(marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade
if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

import java.util.Scanner;

public class Programme3 {


    public static void main(String[] args) {
        setData();

    }

    public static void setData() {
        Scanner student = new Scanner(System.in);
        String sName;
        int roll, maths, science, english, total;
        double percentage;
        String result = null;
        String grade = null;

        System.out.println("Enter Student Name");
        sName = student.next();

        System.out.println("Enter Roll No.");
        roll = student.nextInt();

        System.out.println("Enter Maths Mark.");
        maths = student.nextInt();

        System.out.println("Enter Science Marks.");
        science = student.nextInt();

        System.out.println("Enter English Marks.");
        english = student.nextInt();

        total = maths + science + english;
        percentage = (float) ((total / 300.) * 100);

        System.out.println("Roll =" + roll);
        System.out.println("totalmarks =" + total);
        System.out.println("percentage =" + percentage);

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade is: " + grade);
        } else if (percentage >= 60) {
            grade = "A";
            System.out.println("Grade is: " + grade);
        } else if (percentage >= 50) {
            grade = "B";
            System.out.println("Grade is: " + grade);
        } else if (percentage >= 35) {
            grade = "C";
            System.out.println("Grade is: " + grade);
        }
        if (percentage >= 35) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println("|------------------------- -----|");
        System.out.println("|        Mark Sheet           |");
        System.out.println("|-------------------------------|");
        System.out.println("|Name          : " + sName + "       |");
        System.out.println("|Roll No.      :" + roll + "            |");
        System.out.println("|-------------------------------|");
        System.out.println("|Subject       :     ---        |");
        System.out.println("|-------------------------------|");
        System.out.println("|Maths         :" + maths + "           |");
        System.out.println("|Science       :" + science + "         |");
        System.out.println("|English       :" + english + "         |");
        System.out.println("|-------------------------------|");
        System.out.println("|Total         :" + total + "|");
        System.out.println("|-------------------------------|");
        System.out.println("|Percentage    :" + percentage + "   |");
        System.out.println("|Result        :" + result + "      |");
        System.out.println("|Grade         :" + grade + "       |");
        System.out.println("|--------------------------------|");
        student.close();
    }
}




