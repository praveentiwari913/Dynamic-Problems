import java.util.*;
public class Eqlsumparttab{



    public static void main(String args[]){


int[] arr={1,5,11,5};
int n=arr.length;
int sum=0;
for(int i=0;i<n;i++){


    sum=sum+arr[i];
}
if(sum%2==0){


    sum=sum/2;

    boolean[][] dp=new boolean[n+1][sum+1];

for(int i=0;i<n+1;i++){

    dp[i][0]=true;
}
for(int i=1;i<sum+1;i++){

dp[0][i]=false;

}

for(int i=1;i<n+1;i++){
    for(int j=1;j<sum+1;j++){


        if(j>=arr[i-1]){
            dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
            }else{

                dp[i][j]=dp[i-1][j];
            }
    }
}

System.out.println(dp[n][sum]);




}else{
    System.out.println("false");
}

    }
}