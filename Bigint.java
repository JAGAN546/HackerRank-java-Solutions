import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bigint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        BigInteger m=sc.nextBigInteger();
        BigInteger a,b;
        a=n.add(m);
        b=n.multiply(m);
        System.out.println(a);
        System.out.println(b);
    }
}