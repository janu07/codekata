import java.lang.*;
import java.util.*;
class b58
{
public static void main(String[] args) 
{
Scanner sj = new Scanner(System.in);  
int c=0,f=0;
int n=sj.nextInt();
int r=sj.nextInt();
int n1[]=new int[n];
for(int i=0;i<n1.length;i++)
{
    n1[i]=sj.nextInt();
    if(n1[i]==r)
        f=1;
}
if(f==1)
    System.out.println("yes");
else    
    System.out.println("no");
}
}
