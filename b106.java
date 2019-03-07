import java.util.Scanner;
class b106
{
public static void main(String[] args) 
{
Scanner sj = new Scanner(System.in);
 int l=sj.nextInt();
 int find=sj.nextInt();
 int arr[]=new int[l];
 int j=0,k=0;
 int odd[]=new int[l];
 for(int i=0;i<l;i++)
 {
    arr[i]=sj.nextInt();
 }
 for(int i=0;i<l;i++)
 {
  if(arr[i]%2!=0 &&j!=find)
  {
     
    odd[i]=arr[i];
    k=i;
    j++;
  }
 }
  
 System.out.print(odd[k]);

}
}
