import java.util.Scanner;
 
class CompareStrings
{
	public static void main(String args[])
	{
		String str1=null;
		String str2=null;
		
		Scanner SC=new Scanner(System.in);
		
		str1=SC.next();
		str2=SC.next();		
		
		//compare strings
		if(str1.length()>str2.length())
		{
			System.out.println(str1);
		}
		

		else{
			System.out.println(str2);
		}
		
	}
}
