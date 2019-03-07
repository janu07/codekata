import java.util.Scanner;
class b100
{
    public static void main(String args[])
    {
        int m, n, p = 1;
        Scanner sj = new Scanner(System.in);
        m = sj.nextInt();
        while(m > 0)
        {
            n = m % 10;
            p= p * n;
            m = m / 10;
        }
        System.out.println(p);
    }
}
