import java.util.*;
public class numcoinsBU{


static int fun(int x,int[] dp){



    if(x==1 || x==5 || x==7){
        return 1;
    }
    if(x==0){
        return 0;
    }
    if(dp[x]!=-1){
        return dp[x];
    }
int x1=Integer.MAX_VALUE;
int x2=Integer.MAX_VALUE;
int x3=Integer.MAX_VALUE;
    if(x>=5){
        x1=x/5+fun(x%5,dp);
    }
    if(x>=7){
        x2=x/7+fun(x%7,dp);
    }
    x3=x;


dp[x]=(Math.min(Math.min(x1,x2),x3));
return dp[x];

}
    public static void main(String args[]){


int x=100000000;

        int[] dp=new int[x+1];
for(int i=0;i<x+1;i++){
    dp[i]=-1;
}
       int val= fun(x,dp);
       System.out.println(val);
    }
}