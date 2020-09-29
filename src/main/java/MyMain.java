import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] x = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            x[i] = arr[arr.length - 1 - i];
        }
        return x;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return (arr.length > 2) ? arr[arr.length-2] : -1;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if (arr.length >= 2) {
            float f = (float) arr[1]/(float) arr[0];
            for (int i = 1; i < arr.length-1; i++) {
                if (arr[i] * f != arr[i+1]) {return false;}
            }
            return true;
        } else {return false;}
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4})));
        System.out.println(secondLargest(new int[]{1, 2, 3, 4}));
        System.out.println(isGeometric(new int[]{2, 4, 8, 16}));
    }
}
