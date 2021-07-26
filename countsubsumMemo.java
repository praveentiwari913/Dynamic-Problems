import java.util.*;
public class countsubsumMemo{


static int fun(int[] arr,int n,int sum,int[][] dp){

if(sum==0){
    return 1;
}
if(n==0 || sum<0){
    return 0;
}

if(dp[n][sum]!=-1){
    return dp[n][sum];
}

dp[n][sum]= fun(arr,n-1,sum-arr[n-1],dp)+fun(arr,n-1,sum,dp);
return dp[n][sum];
}


    public static void main(String args[]){



        int[] arr={2,3,5,6,8,10};
        int sum=10;

        int n=arr.length;
        int[][] dp=new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){

            for(int j=0;j<sum+1;j++){
                dp[i][j]=-1;
            }
        }
        int val=fun(arr,n,sum,dp);

        System.out.println(val);
    }
}