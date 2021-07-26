import java.util.*;
public class knapsack{

static int fun(int[] w,int[] v,int B,int n,int[] dp){



    if(n==0 || B==0){
        return 0;
    }
 if(dp[n]!=0){
     return dp[n];
 }
if(w[n]<=B){


    dp[n]= Math.max(v[n]+fun(w,v,B-w[n],n-1,dp),fun(w,v,B,n-1,dp));
    return dp[n];
}else if(w[n]>B){

return fun(w,v,B,n-1,dp);


}


return 0;
}

    public static void main(String args[]){



       
        int[] w={1,2,3,5,6,8,2,5,4,6,2};
        int[] v={1,02,12,50,13,500,100,552,896,852,53};


        int B=20;

int n=w.length;
int[] dp=new int[n];
int ans=fun(w,v,B,n-1,dp);
System.out.println(ans);

    }
}