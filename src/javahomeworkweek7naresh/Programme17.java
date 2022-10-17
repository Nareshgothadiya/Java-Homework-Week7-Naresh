package javahomeworkweek7naresh;

//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Programme17 {

    public static void main(String[] args) {
        Programme17 obj = new Programme17();
        obj.stringArray();

    }

    public void stringArray() {
        int[] numericdata = {25, 48, 48, 35, 85, 47, 96, 13, 89, 51, 7};
        String[] stringdata = {"Naresh", "Viren", "Nimesh", "Vidhi", "Savu", "Palak", "Nimisha"};
        System.out.println("Original value: " + Arrays.toString(numericdata));
        Arrays.sort(numericdata);
        System.out.println("Sorted value: " + Arrays.toString(numericdata));

        System.out.println("Original Names: " + Arrays.toString(stringdata));
        Arrays.sort(stringdata);
        System.out.println("Sorted Names: " + Arrays.toString(stringdata));
    }


}
