import java.util.Scanner;
class sn{

    public static void main(String[] args)
 {
       Scanner input=new Scanner(System.in);
       int num=input.nextInt();	
        int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
