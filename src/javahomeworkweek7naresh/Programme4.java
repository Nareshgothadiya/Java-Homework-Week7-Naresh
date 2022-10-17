package javahomeworkweek7naresh;


import java.util.Scanner;

public class Programme4 {
    public static void main(String[] args) {
        isLeapYear(2000);

       // isLeapYear(-1600);
        //isLeapYear(1600);
       // isLeapYear(2017);
       // isLeapYear(2000);

      //  getDaysInMonth(1, 2020);
       // getDaysInMonth(2, 2020);
     //   getDaysInMonth(2, 2018);
       // getDaysInMonth(-1, 2020);
       // getDaysInMonth(1, -2020);

    }

    public static void isLeapYear(int year) {
        Scanner leapyear = new Scanner(System.in);
        System.out.println("Enter any Year");
        year = leapyear.nextInt();

        boolean isLeap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
           if (isLeap==true){
               System.out.println(year+ "is a leap year");
           }else {
               System.out.println(year+ "is Not a leap year");
           }
        }
         public static int getDaysInMonth ( int month, int year){
            Scanner leapyear1 = new Scanner(System.in);

            int number_of_DaysInMonth = 0;
            String MonthOfName = "Unknown";

            System.out.print("Input a Month number: ");
            month = leapyear1.nextInt();

            System.out.println("Input a Year");
            year = leapyear1.nextInt();

            switch (month){
                case 1:
                    MonthOfName="January";
                    number_of_DaysInMonth = 31;
                    break;
                case 2:
                    MonthOfName="February";
                    if ((year%400==0) || ((year%4==0) && (year% 100!=0))) {
                        number_of_DaysInMonth = 29;
                    }else {
                        number_of_DaysInMonth = 28;
                    }
                    break;
                case 3:
                    MonthOfName="March";
                    number_of_DaysInMonth = 31;
                    break;
                case 4:
                    MonthOfName="April";
                    number_of_DaysInMonth = 30;
                    break;
                case 5:
                    MonthOfName="May";
                    number_of_DaysInMonth = 31;
                    break;
                case 6:
                    MonthOfName="June";
                    number_of_DaysInMonth = 30;
                    break;
                case 7:
                    MonthOfName="July";
                    number_of_DaysInMonth = 31;
                    break;
                case 8:
                    MonthOfName="August";
                    number_of_DaysInMonth = 31;
                    break;
                case 9:
                    MonthOfName="September";
                    number_of_DaysInMonth = 30;
                    break;
                case 10:
                    MonthOfName="October";
                    number_of_DaysInMonth = 31;
                    break;
                case 11:
                    MonthOfName="November";
                    number_of_DaysInMonth = 30;
                    break;
                case 12:
                    MonthOfName="December";
                    number_of_DaysInMonth = 31;
                    break;
            }
            System.out.println(MonthOfName+ "" +year+ " has "+number_of_DaysInMonth+ "days\n");
            return number_of_DaysInMonth;

        }
    }



