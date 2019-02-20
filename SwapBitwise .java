import java.util.*;
class SwapBitwise 
{
 
public static void main(String args[])
{

  Scanner sj=new Scanner(System.in);
    int a=sj.nextInt();
    int b=sj.nextInt();
    a = a ^ b; // XOR operation
    b = a ^ b; 
    a = a ^ b; 
 
    System.out.println(a+" "+ b);
    }
}
