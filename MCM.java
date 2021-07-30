import java.util.*;
public class MCM{

static int fun(int[] arr,int i,int j,int[][] dp){


    if(i>=j){
        return 0;
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
int min=Integer.MAX_VALUE;
    for(int k=i;k<j;k++){

        dp[i][j]=fun(arr,i,k,dp)+fun(arr,k+1,j,dp)+arr[i-1]*arr[k]*arr[j];
        if(dp[i][j]<min){
            min=dp[i][j];
        }
    }
    return min;
}

    public static void main(String args[]){


        int[] arr={40,20,30,10,30};
        int n=arr.length;



      
int[][] dp=new int[n+1][n+1];
for(int i=0;i<n+1;i++){
    for(int j=0;j<n+1;j++){
        dp[i][j]=-1;
    }
}
int i=1;
int j=n-1;
  int val= fun(arr,i,j,dp);
System.out.println(val);

    }
}