import java.util.*;

public class Pangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean flag = true;

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("pangram");
        else
            System.out.println("not pangram");

        sc.close();
    }
}