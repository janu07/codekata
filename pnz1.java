import java.util.Scanner;
class pnz
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT\n");
        int number = input.nextInt();
        if(number > 0)
        {
           System.out.println("\nOUTPUT");
            System.out.println("\nPositive");
        }
        else if(number < 0)
        {
            System.out.println(" \nOUTPUT");
            System.out.println(" \nNegative");
        }
        else
        {
            System.out.println("\nOUTPUT");
            System.out.println("Zero");
        }
    }
}
