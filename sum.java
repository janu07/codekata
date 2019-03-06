import java.util.*;
class sum
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int tot=0,avg;
        Integer[] numbers =new Integer[2];
 
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
            tot=tot+numbers[i];
        }
        System.out.println(tot);
    }
}
