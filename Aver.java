import java.util.*;
class Aver
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tot=0,avg;
        Integer[] numbers =new Integer[n];
 
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
            tot=tot+numbers[i];
        }
        avg=tot/n;
        System.out.println(avg);
    }
}
