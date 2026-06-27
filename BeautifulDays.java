import java.util.*;
public class BeautifulDays {
    void beautifuldays(int i,int j,int k)
    {
        int a,d,n,r,c=0;
        for(a=i;a<=j;a++)
        {
            n=a;
            r=0;
            while(n!=0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if((a-r)%k==0)
                c++;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        BeautifulDays ob=new BeautifulDays();
        ob.beautifuldays(i,j,k);
        sc.close();
    }
}
