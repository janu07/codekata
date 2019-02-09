import java.util.*;
import java.util.Scanner;
class prime_se{
      public static void main(String aa[]){
           int e,s;
           int f=0;
           Scanner sj=new Scanner(System.in);
           s=sj.nextInt();
           e=sj.nextInt();
           for(int i=s;i<=e;i++){
               for(int j=2;j<i;j++){
                   if(i%j==0){
                       f=0;
                       break;
                   }
               else{
                       f=1;
               }
               }
               if(f==1){
                   System.out.println(i);
               }

           }

}
}
