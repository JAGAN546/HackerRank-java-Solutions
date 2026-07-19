import java.util.Scanner;
public class BillD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int i,h,s=0,act;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int bill=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s=s+a[i];
        }
        s=s-a[k];
        h=s/2;
        act=bill-h;
        if(act==0)
            System.out.println("Bon Appetit");
        else    
            System.out.println(act);
        sc.close();
    }
}