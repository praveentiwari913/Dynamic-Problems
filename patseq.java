import java.util.*;
public class patseq{



    public static void main(String args[]){


        String st1="AXY";
        String st2="ADXCPY";

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

            if(dp[n][m]==n){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

    }
}