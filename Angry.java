import java.util.Scanner;

public class Angry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c,i,k,n,t;
        t=sc.nextInt();
        while(t-->0)
        {
            c=0;
            n=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();  
            for(i=0;i<n;i++)
            {
                if(a[i]<=0)
                    c++;
            }
            if(c<k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
