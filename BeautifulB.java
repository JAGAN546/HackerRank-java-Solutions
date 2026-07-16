import java.util.Scanner;

public class BeautifulB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        n=sc.nextInt();
        String s=sc.next();
        String s1="010";
        for(i=0;i<=s.length()-3;i++)
        {
            if(s.substring(i,i+3).equals(s1))
            {
                c++;
                i+=2;
            } 
        }
        System.out.println(c);
        sc.close();
    }
}
