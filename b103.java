import java.util.Scanner;
class b103
{
public static void main(String[] args) 
{
Scanner sj= new Scanner(System.in);
String str= sj.nextLine();
String array[]= str.split(" ",0);
for(int i=0;i<array.length;i++)
{
char a=array[i].charAt(0);
char t=Character.toUpperCase(a);
array[i]=array[i].replace(a,t);
System.out.print(array[i]+" ");
}

}
}
