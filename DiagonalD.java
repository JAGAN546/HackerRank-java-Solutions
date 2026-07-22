import java.util.*;
public class DiagonalD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int i,j,s=0,s1=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
                s=s+a[i][i];
        }
        for(i=0;i<n;i++)
        {
                s1=s1+a[i][n-1-i];
        }
        System.out.println(Math.abs(s-s1));
    }
}
