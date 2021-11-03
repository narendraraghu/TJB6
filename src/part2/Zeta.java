package part2;

public class Zeta {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicateFromArray(arr));
    }

    private static int removeDuplicateFromArray(int[] arr) {

        int[] tempArray = new int[2];
        int[] tempArray1 = new int[arr.length];
        int k = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;

            }
            if (count>=2)
            {
                tempArray1[i] = tempArray[0];
                tempArray1[i + 1] = tempArray[1];
            }

        }
        return 0;
    }
}
