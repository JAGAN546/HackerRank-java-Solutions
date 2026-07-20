import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        k = k % 26;

        String result = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + k);

                if (ch > 'z')
                    ch = (char) (ch - 26);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + k);

                if (ch > 'Z')
                    ch = (char) (ch - 26);
            }

            result = result + ch;
        }

        System.out.println(result);
        sc.close();
    }
}