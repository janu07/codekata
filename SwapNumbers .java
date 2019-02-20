import java.util.*;
class SwapNumbers 
{

    public static void main(String[] args) 
    {
        Scanner sj=new Scanner(System.in);
        int n1=sj.nextInt();
        int n2=sj.nextInt();
        
        n1 =n1 - n2;
        n2 =n1 + n2;
        n1 = n2 - n1;

        System.out.println(n1 + " " + n2);
    }
}
