import java.io.*;
class SpecialCount
{
public static void main(String ser[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
String s=br.readLine();
int i,l,c1=0,c2=0,c3=0,sp=0;
char ch;
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(Character.isLetter(ch))
++c1;
else if(Character.isDigit(ch))
++c2;
else if(ch==' ')
++sp;
else
++c3;
}
System.out.println("no of Symbol="+c3);
}
}
