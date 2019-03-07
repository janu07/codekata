import java.util.*;
class b97
{ 
	public static void main(String[] args) 
	{
		int num,rev=0;
        Scanner	sj= new Scanner(System.in);
        num=sj.nextInt();
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num =num/ 10;
        }
        
        System.out.print(rev);
       
	}
}
