package excel;
//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int lengthOfBigArray= (m>n)?m:n;

        int arr[] = new int[nums1.length];
        int i=0,j=0,k=0;
        while(i<nums1.length)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k] = nums1[i++];
            }
            else
                arr[k] = nums2[j++];
            k++;
        }
     return arr;
    }
    public static void main(String[] args) {
        System.out.println(merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6}, 3));
    }
}
