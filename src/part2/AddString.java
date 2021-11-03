package part2;

public class AddString {
    public static void main(String[] args) {
        System.out.println(addString("12","22"));
    }

    private static String addString(String s1, String s2) {
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        while (num1>0) {
            int rem = num1%10;
            num1 = num1/10;
            System.out.println(rem);
        }

        while (num2>0) {
            int rem = num2%10;
            num2 = num2/10;
            System.out.println(rem);
        }
        return s1+s2;
    }
}




//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.