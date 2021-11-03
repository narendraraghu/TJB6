package excel;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i=0;
        for(i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target) {
                    arr[0] = i;
                    arr[1] =j;
                    return arr;
                }
            }
        return arr;
    }
    public static void main(String[] args) {
        int target = 10;
        int arr[] = {2,5,5,11};
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
