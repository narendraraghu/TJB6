package part2;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    private static int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int ans[] = new int[n];

        for (int i = 0; i < 2 * nums.length; i++) {

            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }

        }
        return ans;
    }
}
