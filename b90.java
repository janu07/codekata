import java.util.*;
class b90
{
	
	public static void main(String[] args) 
	{
		String ip;
        Scanner	sj = new Scanner(System.in);
        ip=sj.next();

        char ch[]=ip.toCharArray();
    
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))
            {    
              System.out.print(ch[i]);
            }    
        }	
	}
}
