package javahomeworkweek7naresh;

//Write a Java program to sum values of an array.

import javax.crypto.spec.PSource;

public class Programme18 {
    public static void main(String[] args) {
        myMethod();

    }

    public static void myMethod() {

        int a[] = {4, 6, 8, 45, 57, 47, 76};
        int sum = 0;
        {
            for (int value : a)
                sum = sum + value;
        }
        System.out.println("Sum of the Array Elements are: " + sum);
    }
}
//   for (int i = 0; i < a.length - 1; i++) ;
//      sum = sum + a[i];