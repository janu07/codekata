import java.util.*;
import java.lang.*;
class integercount
{
	public static void main(String args[])
	{
	      String a;
	      int c=0;
	      Scanner sj=new Scanner(System.in);
	      a=sj.nextLine();
	      for(int i=0;i<a.length();i++)
	      {
	          switch(a.charAt(i))
	        {
		case '0':
		case '1':
		case '2':
		case '3': 
		case '4':
		case '5': 
		case '6':
		case '7':  
		case '8':
		case '9': 
			c++;
			break;			
	           }
                         }
	      System.out.println(c);
    }    
}
