import java.util.*;
import java.util.Arrays;
public class LC3S{


public static void main(String args[]){

String s1="axby";
int n=s1.length();
String s2="abcy";
int m=s2.length();
int[][] dp=new int[n+1][m+1];


for(int i=1;i<=n;i++){


    for(int j=1;j<=m;j++){


        if(s1.charAt(i-1)==s2.charAt(j-1)){
            dp[i][j]=1+dp[i-1][j-1];
       //     System.out.println("x");
        }else{

            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
}
System.out.println(Arrays.deepToString(dp));
System.out.println(dp[n][m]);




}


}