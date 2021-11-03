package part2;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros.moveZeroes(nums)));
        System.out.println(Arrays.toString(moveZeros.moveZeroes1(nums)));
    }

    private int[] moveZeroes1(int[] nums) {
        int j = nums.length - 1;
        System.out.println(nums[j]);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[i + 1];
                nums[j--] = 0;
            } else
                i++;

        }  return nums;
    }
    public int [] moveZeroes(int[] nums) {
        int size = nums.length;
        int arr[] = new int[size];
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }
}
