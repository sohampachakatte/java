package String.hw;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        char[] str3 = str1.toCharArray();
        char[] str4 = str2.toCharArray();

        Arrays.sort(str3);
        Arrays.sort(str4);

        if (Arrays.equals(str3, str4)) {
            System.out.println(str1 + " & " + str2 + " both are anagram");
        } else {
            System.out.println(str1 + " & " + str2 + " both are not anagram");
        }
    }
}
