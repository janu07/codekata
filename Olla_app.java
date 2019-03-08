import java.util.*;

class Olla_app
{
      public static void main(String[] args) 
      {
	   	
	int km,cost=0;

        Scanner sc=new Scanner(System.in)
;
	System.out.println("Enter the source kilometer:");
       	int s=sc.nextInt();

	System.out.println("Enter the destination kilometer:");
	int d=sc.nextInt();

	System.out.println("Enter the vehical:");
	String v=sc.next();

	km=d-s;

	switch(v)
	{
		case "car":
			cost=km*10;
			break;
		case "ven":
			cost=km*15;
			break;
		case "bus":
			cost=km*7;
			break;
		
		
	}
	
             		
      	System.out.println("KiloMeters are:"+km);
	System.out.println("Total cost is:"+cost);
      
      }
 
}
