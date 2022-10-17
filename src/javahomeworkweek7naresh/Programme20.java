package javahomeworkweek7naresh;


//Write a Java program to test if an array contains a specific value.

public class Programme20 {

    public static void main(String[] args) {

        int[] userInput = {1, 4, 5, 6, 7, 20};
        int specificElements = 7;
        Programme20.getSpecificValue(userInput, specificElements);
    }

    public static void getSpecificValue(int[] userInput, int specificElement) {
        int[] input = userInput;
        int element = specificElement;
        for (int i = 0; i < input.length; i++) {
            System.out.println("" + input[i]);
        }
    }
}
