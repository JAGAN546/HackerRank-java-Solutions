import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3,s4,s5,s6;
        int l=0;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = s1.toLowerCase();
        s4 = s2.toLowerCase();
        l = s3.length() + s4.length();
        System.out.println(l);
        if(s3.charAt(0)>s4.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");
        s5 = s3.substring(0,1).toUpperCase()+s3.substring(1);
        s6 = s4.substring(0,1).toUpperCase()+s4.substring(1);
        System.out.println(s5+" "+s6);
        sc.close();
    }
}