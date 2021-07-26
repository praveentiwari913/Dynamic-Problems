import java.util.*;
public class bagtab{



    public static void main(String args[]){

        int[] arr={2,3,5,10,12};
        int n=arr.length;
        int target=11;
        boolean[][] dp=new boolean[n+1][target+1];

    for(int i=0;i<=n;i++){
       dp[i][0]=true;
    }
for(int i=1;i<=target;i++){
   dp[0][i]=false;
}

for(int i=1;i<n+1;i++){


    for(int j=1;j<target+1;j++){


        if(arr[i-1]<=j){

                dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];


        }else{
            dp[i][j]=dp[i-1][j];
        }
    }
}



System.out.println(dp[n][target]);


    }
}