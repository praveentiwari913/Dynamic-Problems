import java.util.*;
public class coinchange{




    public static void main(String args[]){

 int[] arr={1,2,3};
 int n=arr.length;
 int sum=5;


 int[][] dp=new int[n+1][sum+1];

 for(int i=0;i<n+1;i++){

     dp[i][0]=1;
 }
 for(int i=1;i<sum+1;i++){

     dp[0][i]=0;
 }
 

 for(int i=1;i<n+1;i++){
     for(int j=1;j<sum+1;j++){
         

 if(arr[i-1]<=j){

        dp[i][j]=dp[i][j-arr[i-1]]+dp[i-1][j]; 


 }else{
     dp[i][j]=dp[i-1][j];
 }



     }
 }

 System.out.println(dp[n][sum]);


    }
}