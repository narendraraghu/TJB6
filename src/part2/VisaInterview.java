package part2;

import java.util.HashSet;
import java.util.Set;

public class VisaInterview {

    public static void main(String[] args) {
        String  str = "aabccdb";
        Set<Character> set = new HashSet<>();
        char [] charArr = str.toCharArray();
        for (int i = 0; i <charArr.length ; i++) {
            if(!set.add(charArr[i])) {
                charArr[i]='*';
            }
        }
        System.out.println(charArr);
        }
    }


