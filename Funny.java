import java.util.*;

public class Funny {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {

            String s = sc.next();
            String rev = "";

            // Reverse the string
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }

            boolean funny = true;

            for (int i = 0; i < s.length() - 1; i++) {

                int d1 = Math.abs(s.charAt(i) - s.charAt(i + 1));
                int d2 = Math.abs(rev.charAt(i) - rev.charAt(i + 1));

                if (d1 != d2) {
                    funny = false;
                    break;
                }
            }

            if (funny)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }

        sc.close();
    }
}