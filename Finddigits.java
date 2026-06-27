import java.util.*;

public class Finddigits {
    void digits(int n)
    {
        int d,c=0,n1;
        n1=n;
        while(n1!=0)
        {
            d=n1%10;
            if(d!=0 && n%d==0)
                c++;
            n1=n1/10;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,num = 0;
        n=sc.nextInt();
        Finddigits ob=new Finddigits();
        for(i=1;i<=n;i++)
        {
            num=sc.nextInt();
            ob.digits(num);
        }
        sc.close();
    }
}
