import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class b83
{

     public static void main(String aa[])
     {
     double a;
     double  b;
     double y;
     char c;
     Scanner sj=new Scanner(System.in);
     a=sj.nextInt();
     c=sj.next().charAt(0);
       b=sj.nextInt();
        switch(c)
        {
            case '+':
                   y=a+b;
                  System.out.printf("%.0f",y);
                  break;
           case '-':
                 y=a-b;
                System.out.printf("%.0f",y);
                 break;
           case '/':
                y=a/b;
                System.out.printf("%.0f",y);
                break;
           case '%':
                y=a%b;
                System.out.printf("%.0f",y);
                break;
           
   }
}
}
