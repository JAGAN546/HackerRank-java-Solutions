import java.util.Scanner;

public class Arraysum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,i,s=0;
    n=sc.nextInt();
    int[] a=new int[n];
    for(i=0;i<a.length;i++)
        a[i]=sc.nextInt();
    for(i=0;i<a.length;i++)
        s=s+a[i];
    System.out.println(s);
    sc.close();
  }  
}
