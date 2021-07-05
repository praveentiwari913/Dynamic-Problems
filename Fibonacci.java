import java.util.*;
import java.time.*;
public class Fibonacci{

static int fibi(int n,int[] ans){

if(n==0 || n==1){
    return n;
}
if(ans[n]!=-1){

return ans[n];
}
    ans[n]= fibi(n-1,ans)+fibi(n-2,ans);
    return ans[n];
}

    public static void main(String args[]){
        long startTime = Instant.now().toEpochMilli();
        int n=9;
int[] ans=new int[n+1];
for(int i=0;i<ans.length;i++){


    ans[i]=-1;
}
       int val= fibi(n,ans);
       System.out.println(val);
       long endTime = Instant.now().toEpochMilli();
long totalTime = endTime - startTime;
System.out.println("Execution time in milliseconds: " + totalTime);
   //   System.out.println(v/1000000);
    }
}