import java.util.*;
public class LIS{



    public static void main(String args[]){



        int[] arr={3,1,2,5,4,6,5,6};
        int n=arr.length;
        int[] dp=new int[arr.length];

         for(int i=0;i<dp.length;i++){
             dp[i]=1;
         }

         for(int i=1;i<n;i++){
             for(int j=0;j<=i-1;j++){
                 if(arr[i]>arr[j]){
                     dp[i]=Math.max(dp[i],1+dp[j]);
                 }
             }
         }
 int min=Integer.MIN_VALUE;
 for(int i=0;i<dp.length;i++){
            min=Math.max(min,dp[i]);
         }

System.out.println(min);

    }
}