import java.util.*;
import java.time.*;
public class reducex{

//static int max=Integer.MAX_VALUE;
static int fun(int x,int[] dp){
    if( x<1 ){
        return Integer.MAX_VALUE;
    }
    if(x==2 || x==3){
        return 1;
    }
if(x==1 ){
   
    return 0;
}
if(dp[x]!=-1){
    return dp[x];
}
//System.out.println(x);

int x3=Integer.MAX_VALUE;
int x2=Integer.MAX_VALUE;

if(x%3==0){
  x3 =1+ fun(x/3,dp);
}
if(x%2==0){
   x2=1+ fun(x/2,dp);
}
int x1=1+ fun(x-1,dp);
dp[x]=Math.min(Math.min(x2, x3),x1);
return dp[x];
}
    public static void  main(String args[]){

        long startTime = Instant.now().toEpochMilli();
        int x=10;
       int[] dp=new int[x+1];
       for(int i=0;i<x+1;i++){
           dp[i]=-1;
       }
     int val=   fun(x,dp);
        System.out.println(val);
        long endTime = Instant.now().toEpochMilli();
        long totalTime = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + totalTime);
    }
}