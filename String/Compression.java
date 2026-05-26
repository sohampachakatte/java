package String;

public class Compression {

    public static String compression(String ch) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < ch.length(); i++) {

            int count = 1;

            while (i + 1 < ch.length() && ch.charAt(i) == ch.charAt(i + 1)) {
                count++;
                i++;
            }

            str.append(ch.charAt(i));

            if (count > 1) {
                str.append(count);
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {

        String ch = "aabbccdd";

        System.out.println(compression(ch));
    }
}