import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        // int l=Math.abs(s1.length())/3;
        int c=0;
        for(int i=0;i<s1.length();i+=3)
        {
            if(s1.charAt(i)!='S')
                c++;
            if(s1.charAt(i+1)!='O')
                c++;
            if(s1.charAt(i+2)!='S')
                c++;
        }
        System.out.println(c);
        sc.close();
    }   
}