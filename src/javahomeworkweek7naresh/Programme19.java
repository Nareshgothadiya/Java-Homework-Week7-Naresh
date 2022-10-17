package javahomeworkweek7naresh;

//Write a Java program to calculate the average value of array elements.

public class Programme19 {

    public static void main(String[] args) {
        valueofarray();

    }

    public static void valueofarray() {

        int a[] = {10, 9, 77, 79, 10, -2, 57, 86, 28, 90};
        double sum = 0;
        double ave = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        ave = sum / a.length;
        System.out.println("The Average of value of this arrey is = " + ave);
    }

}
