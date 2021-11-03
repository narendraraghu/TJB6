package part2;

public class StringPalindrom {

    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrom(str));
    }

    private static boolean isPalindrom(String str) {

        if(str==null){
            System.out.println("String cannot be null");
            return false;
        }
        int length = str.length()-1;
        int i =0;
        while (i<length)
        {
            if(str.charAt(i)!=str.charAt(length))
                return false;
            i++;
            length--;
        }
        return true;
    }
}
