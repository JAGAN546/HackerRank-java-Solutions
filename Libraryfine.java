import java.util.*;
public class Libraryfine {
    void fine(int d1,int m1,int y1,int d2,int m2,int y2)
    {
        if (y1 > y2)
            System.out.println(10000);
        else if (y1 == y2 && m1 > m2)
            System.out.println(500 * (m1 - m2));
        else if (y1 == y2 && m1 == m2 && d1 > d2)
            System.out.println(15 * (d1 - d2));
        else
            System.out.println(0);
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
     int a,b,c,d,e,f;
     a=sc.nextInt();
     b=sc.nextInt();  
     c=sc.nextInt();
     d=sc.nextInt();
     e=sc.nextInt();
     f=sc.nextInt();
     Libraryfine ob=new Libraryfine();
     ob.fine(a,b,c,d,e,f);
     sc.close();
    }
}
