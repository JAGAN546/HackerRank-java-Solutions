import java.util.*;
public class Staircase {
    void staircase(int n)
    {
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                for(int k=i-1;k>=1;k--)
                {
                    System.out.print("");
                }
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        Staircase ob=new Staircase();
        ob.staircase(n);
        sc.close();   
    }
}