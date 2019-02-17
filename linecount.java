import java.util.*;
import java.lang.*;
class linecount
{
	public static void main(String args[])
	{
	      String a;
	      int c=1;
	      Scanner sj=new Scanner(System.in);
	      a=sj.nextLine();
	      for(int i=0;i<a.length();i++)
	      {
	          if(a.charAt(i)=='.')
	          {	
	              c++;
          	          }
                         }
	      System.out.println(c);
    }    
}
