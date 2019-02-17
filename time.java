import java.util.*;
class time
{
public static void main(String arg[])
{
	int hours=0;	
	Scanner sj=new Scanner(System.in);
	int min=sj.nextInt();
	if(min>60)
	{
		hours=min/60;
		min=min%60;
	}
	else
	{
		min=min;
		
	}
	System.out.println(hours+" " +min);
}
}
