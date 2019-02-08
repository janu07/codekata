import java.io.*;
import java.util.*;
import java.util.Scanner;
class palin
{
    public static void main(String args[])
      {
        int ans=0,temp,n,input;
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        temp=input;
        while(input>0)
          {
            n=input%10;
            ans=ans*10+n;
            input=input/10;
          }
          
        if(ans==temp)
          {
          System.out.println("Yes");
	}
        else
          {
          System.out.println("No");
          }
     }
}     
