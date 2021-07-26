import java.util.*;
public class knapsack1memo{

static boolean fun(int[] arr,int n,int target,boolean[][] dp){

if(target==0 ){

    return true;
}
if(target<0 || n==0){
    return false;
}
if(dp[n][target])

dp[n][target]= fun(arr,n-1,target-arr[i]) || fun(arr,n-1,target);
return dp[n][target];
}

    public static void main(String args[]){

           int[] arr={2,3,7,8,10};
int target=11;
boolean[][] dp=new boolean[arr.length+1][target+1];
int i=0;
    System.out.println(fun(arr,n,target,dp));


    }
}