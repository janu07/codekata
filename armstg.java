import java.util.*;
class armstg{
      public static void main(String aa[]){
           int s,e;
           int f;
           int sum=0;
           Scanner sj=new Scanner(System.in);
           s=sj.nextInt();
           f=s;
           while(s>0){
               e=s%10;
               sum=sum+e*e*e;
               s=s/10;
           }
           if(f==sum){
               System.out.println("YES");
           }
        else{
               System.out.println("NO");
            }
}
}
