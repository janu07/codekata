import java.util.*;
class play8
{
    public static void main(String ar[])
     {
        Scanner sj=new Scanner(System.in);
        String sen=sj.nextLine().toLowerCase();
        int len=0,i=0;
       
        String str[] = sen.split(" ",-2);
        
        while(i<str.length)
        { 
          int j=0;
          char ch[]=str[i].toCharArray();
          int chlen=ch.length;
          while(j<chlen)
            {
              ch[0]=Character.toUpperCase(str[i].charAt(0));
              System.out.print(ch[j]);
              j++;
            }
            System.out.print(" ");
          
        i++;
        }
    }
}
