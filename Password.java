import java.util.*;

public class Password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int digit = 0;
        int lower = 0;
        int upper = 0;
        int special = 0;

        String sp = "!@#$%^&*()-+";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9')
                digit = 1;

            else if (ch >= 'a' && ch <= 'z')
                lower = 1;

            else if (ch >= 'A' && ch <= 'Z')
                upper = 1;

            else if (sp.indexOf(ch) != -1)
                special = 1;
        }

        int count = 0;

        if (digit == 0)
            count++;

        if (lower == 0)
            count++;

        if (upper == 0)
            count++;

        if (special == 0)
            count++;

        if (n + count < 6)
            System.out.println(6 - n);
        else
            System.out.println(count);

        sc.close();
    }
}