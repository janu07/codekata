import java.lang.*;
import java.util.*;
class b57
{
public static void main(String[] args) 
{
Scanner sj = new Scanner(System.in);  
int c=0;
int n=sj.nextInt();
int r=sj.nextInt();
int n1[]=new int[n];
for(int i=0;i<n1.length;i++)
{
    n1[i]=sj.nextInt();
    if(n1[i]==r)
        c++;
    
}
System.out.println(c);
}
}
