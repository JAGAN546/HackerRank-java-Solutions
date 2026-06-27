import java.util.*;
public class Sherlocksquares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,a,b;
        t=sc.nextInt();
        while(t!=0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            int start = (int) Math.ceil(Math.sqrt(a));
            int end = (int) Math.floor(Math.sqrt(b));

            if (start <= end)
                System.out.println(end - start + 1);
            else
                System.out.println(0);
            t--;
        }
        sc.close();
    }
}
