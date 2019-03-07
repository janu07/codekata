import java.util.Scanner;
 class b81
{
    public static void main(String args[])
    {
    Scanner sj =new Scanner(System.in);
    int n1,n2,i; 
	 n1=sj.nextInt(); 
        n2=sj.nextInt();

	 
    if(n1>n2)
	{ 
        System.out.println(n1-n2);
	}
	else
	{ 
        
        System.out.println(n2-n1);
	}
    }
 
}
