import java.util.*;
public class minsubsum{



    public static void main(String args[]){



        int[] arr={1,2,7};

        int sum=0;

        int n=arr.length;
        for(int i=0;i<n;i++){

         sum=sum+arr[i];

        }
      

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
ArrayList<Integer> ans=new ArrayList<Integer>();

for(int i=0;i<sum/2;i++){

    if(dp[n][i]==true){ans.add(i);}
}

int min=Integer.MAX_VALUE;
for(int i=0;i<ans.size();i++){

min=Math.min(min,sum-2*ans.get(i));
//System.out.println(min);

}

System.out.println(min);
    }
}