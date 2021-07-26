import java.util.*;
public class targetsumMemo{

static int fun(int[] arr,int tar,int n,int sum,int[][] dp){



    if(sum==1 && n==0){

        return 1;
    }

    if(n==0){
        return 0;
    }
if(dp[n][sum]!=-1){
    return dp[n][sum];
}

    dp[n][sum]= fun(arr,tar,n-1,sum-arr[n-1],dp)+fun(arr,tar,n-1,sum+arr[n-1],dp);
    return dp[n][sum];
}


    public static void main(String args[]){


int[] arr={1,1,2,3};
int tar=1;
int sum2=0;
int n=arr.length;
for(int i=0;i<n;i++){
sum2=sum2+arr[i];

}

int[][] dp=new int[n+1][2*sum2+1];

for(int i=0;i<n+1;i++){

 for(int j=-sum2;j<sum2+1;j++){
     dp[i][j]=-1;
 }

}
int sum=0;
int val=fun(arr,tar,n,sum,dp);
System.out.println(val);

    }
}