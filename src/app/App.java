package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String input = "abcdefghijaaaaaaaklmnopqrstuvwxyz";
        char[] inputChar = input.toCharArray();
        Arrays.sort(inputChar);
        double ki = 0;

        for(int i = 0; i < input.length(); i++) {
            int number = getNumberOfElements(inputChar, inputChar[i]);
            ki += Math.pow( (double) number / inputChar.length, 2);
            i += number - 1;
        }

        System.out.println(ki);
    }

    private static int getNumberOfElements(char[] arr, char c) {
        int number = 0;
        for(int i = findFirstOccurrence(arr, c); i < arr.length && arr[i] == c; i++) {
            number++;
        }
        return number;
    }

    private static int findFirstOccurrence(char[] arr, char c) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == c) {
                return i;
            }
        }
        return -1;
    }
}