import java.util.Arrays;
import java.util.stream.IntStream;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        return IntStream.range(1, arr.length+1).boxed().mapToInt(i -> arr[arr.length - i]).toArray();
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        return Arrays.stream(arr).sorted().toArray()[arr.length-2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        return IntStream.range(0, arr.length-1).boxed().mapToInt(i -> (arr[i] * (float) arr[1]/(float) arr[0] == arr[i+1]) ? i : -1).noneMatch(i -> i == -1);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4})));
        System.out.println(secondLargest(new int[]{1, 2, 3, 4}));
        System.out.println(isGeometric(new int[]{1, 2, 4, 8, 16, 33}));
    }
}
