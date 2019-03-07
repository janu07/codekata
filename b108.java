import java.util.Arrays;
import java.util.Scanner;
class b108
{
public static void main(String[] args) 
{
Scanner sj= new Scanner(System.in);
 int a=sj.nextInt();
 int b=sj.nextInt();
 int arr[]=new int[a];
 for(int i=0;i<a;i++)
 {
     arr[i]=sj.nextInt();
 }
 Arrays.sort(arr); 
System.out.print(arr[b-1]);


}
}
