import java.util.*;
import java.time.*;
public class FibonacciTopD{



    public static void main(String args[]){
        final long startTime = System.currentTimeMillis();
        int n=9;
int[] ans=new int[n+1];
ans[0]=0;
ans[1]=1;
for(int i=2;i<ans.length;i++){


    ans[i]=ans[i-1]+ans[i-2];
}
     //  int val= fibi(n,ans);
       System.out.println(ans[n]);
     // long v= System.currentTimeMillis();
   //   System.out.println(v/1000000);
   final long elapsedTimeMillis = System.currentTimeMillis() - startTime;
   System.out.println("Total execution time: " + (elapsedTimeMillis));
    }
}