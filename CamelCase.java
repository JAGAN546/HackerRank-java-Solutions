import java.util.*;
public class CamelCase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int c=1,l,i;
        // System.out.println("Enter a sentence:");
        s=sc.nextLine();
        l=s.length();
        for(i=1;i<l;i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                c++;
        }
        System.out.println(c);
        sc.close();
    }
}