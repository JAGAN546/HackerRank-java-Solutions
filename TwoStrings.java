// import java.util.*;
// public class TwoStrings
// {
//     public static void main(String []args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int l,l1,i,j,c;
//         while(n-->0)
//         {
//             String s,s1;
//             s=sc.next();
//             s1=sc.next();
//             l=s.length();
//             l1=s1.length();
//             c=0;
//             for(i=0;i<l;i++)
//             {
//                 for(j=0;j<l1;j++)
//                 {
//                     if(s.charAt(i)==(s1.charAt(j)))
//                     {
//                         c++;
//                         break;
//                     }
//                 }
//             }
//             if(c>0)
//                 System.out.println("YES");
//             else
//                 System.out.println("NO");
//         }
//         sc.close();
//     }
// } It consumes much time it is right but not optimal in time.
import java.util.*;

public class TwoStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s1 = sc.next();
            String s2 = sc.next();

            boolean[] arr = new boolean[26];

            for(int i = 0; i < s1.length(); i++)
            {
                arr[s1.charAt(i) - 'a'] = true;
            }

            boolean found = false;

            for(int i = 0; i < s2.length(); i++)
            {
                if(arr[s2.charAt(i) - 'a'])
                {
                    found = true;
                    break;
                }
            }

            if(found)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}