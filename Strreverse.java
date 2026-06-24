import java.io.*;
import java.util.*;

public class Strreverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B="";
        // String C=A;
        int i;
        for(i=A.length()-1;i>=0;i--)
            B = B + A.charAt(i); 
        if(B.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}