import java.util.*;

import java.io.*;
public class lcspefficient{



    public static void main(String args[]){



        String st1="acbcf";

        String st2="abcdaf";

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

         int i=n;
         int j=m;
          String ans="";
          while(i!=0 && j!=0){


      if(st1.charAt(i-1)==st2.charAt(j-1)){

           ans+=st1.charAt(i-1);
           i--;
           j--;
      }else{
          
          if(dp[i-1][j]>dp[i][j-1]){

              i--;
          }else{
              j--;
          }
      }


          }
          String an= new StringBuffer(ans).reverse().toString();
System.out.println(an);
    }
}