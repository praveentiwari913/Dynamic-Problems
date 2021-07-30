import java.util.*;
public class mindeladd{





    public static void main(String args[]){



        String st1="heap";
        String st2="pea";

int n=st1.length();
int m=st2.length();


        int[][] dp=new int[n+1][m+1];

for(int i=1;i<n+1;i++){

    for(int j=1;j<m+1;j++){


        if(st1.charAt(i-1)==st2.charAt(j-1)){

            dp[i][j]=1+dp[i-1][j-1];
        }else{

            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
}

int del=m-dp[n][m];
int add=n-dp[n][m];

System.out.println(del+" "+add);

    }
}