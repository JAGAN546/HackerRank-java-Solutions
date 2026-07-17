import java.util.*;
public class Casear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        String s;
        n=sc.nextInt();
        s=sc.next();
        // sc.nextLine();
        k=sc.nextInt();
        for(i=0;i<s.length();i++)
        {
            // if(s.charAt(i).toUpperCase())
            System.out.print(s.charAt(i)+" ");
        }
        sc.close();
    }
}
