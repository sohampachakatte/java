package String.hw;

import java.util.*;

public class count {
    public static void countLowercaseVowels(String word) {
        int count = 0;
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o'
                    || word.charAt(j) == 'u') {
                count++;
            }
        }
        System.out.println("No of Lowercase Vowels count : " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String string = sc.nextLine();

        countLowercaseVowels(string);

    }

}
