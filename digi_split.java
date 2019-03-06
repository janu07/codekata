import java.util.*;
class Aver
{
     public static void main(String aa[])
{
    String a;
    int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     a=String.valueOf(n);
     char b[]=a.toCharArray();
     for(int i=0;i<b.length;i++)
{
         System.out.print(b[i]);
if(i<b.length-1)
{
System.out.print(" ");
}
     } 
}
}
