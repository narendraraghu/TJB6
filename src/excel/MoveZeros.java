package excel;
import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZerosAtEnd1(arr)));
    }
    //accepted on leetcode
    public static int[] moveZerosAtEnd1(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        return arr;
    }

    private static int[] moveZerosAtEnd(int[] arr) {
        int newArr[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j++] = arr[i];
            }
        }
    return newArr;
    }
}
