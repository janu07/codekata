import java.util.*;
class NoString
{
     public static void main(String aa[])
{
    int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
	if(n<=10)
	{
		switch(n)
		{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			case 10:
				System.out.print("Ten");
				break;
			}

     }
		s.close(); 
}
}
