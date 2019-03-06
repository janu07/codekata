import java.util.*;
class TwoPower
{
    public static void main(String []agr) 
{
	int flag=0,temp;
	Scanner sj=new Scanner(System.in);
	int num=sj.nextInt();
	temp=num;
	while(temp!=1)
	{
		if(temp%2!=0)
		{
			flag=1;
			break;
			
		}
		temp=temp/2;
	}
	if(flag==0)
	{
		System.out.println("Yes");
	}
	else if(flag==1)
	{
	System.out.println("No");
	}
}
}
