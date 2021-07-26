import java.util.*;
public class lcspt{


    public static void main(String args[]){


        String st1="acbcf";

        String st2="abcdaf";

        

        int n=st1.length();
        int m=st2.length();

    String[][] dp=new String[n+1][m+1];
    for(int i=0;i<n+1;i++){

        for(int j=0;j<m+1;j++){


          dp[i][j]="";
        }
    }
    for(int i=1;i<n+1;i++){

        for(int j=1;j<m+1;j++){


            if(st1.charAt(i-1)==st2.charAt(j-1)){

                dp[i][j]=st1.charAt(i-1)+dp[i-1][j-1];
            }else{
                dp[i][j]=(dp[i][j-1].length()>dp[i-1][j].length()? dp[i][j-1]:dp[i-1][j]);
            }
        }
    }

System.out.println(dp[n][m]);
    }
}