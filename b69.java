import java.util.Scanner;
 class b69
{
    public static void main(String args[])
    {
        
        Scanner sj = new Scanner(System.in);
        int m = sj.nextInt();
        int n = sj.nextInt();
        int d=m-n;
       
            if(d%2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
    }
}
