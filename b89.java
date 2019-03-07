import java.util.*;
class b89
{
	
	public static void main(String[] args) 
	{
		String ip;
        Scanner	sj = new Scanner(System.in);
        ip=sj.next();

        char ch[]=ip.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);    
        }	
	}
}
