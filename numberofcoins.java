import java.util.*;
public class numberofcoins{




    public static void main(String args[]){

        int val=11;
        int[] coins={1,5,7};
        int[] dp=new int[val+1];
for(int i=0;i<coins.length;i++){
    dp[coins[i]]=1;
}
dp[0]=0;

for(int i=1;i<val+1;i++){

    if(dp[i]!=1){
         int x1=Integer.MAX_VALUE;
         int x2=Integer.MAX_VALUE;
         int x3=Integer.MAX_VALUE;
         if(i>coins[0]){
            x1= i/coins[0]+dp[i%coins[0]];
          //  System.out.println("x");
         }
         if(i>coins[1]){
            x2= i/coins[1]+dp[i%coins[1]];
           // System.out.println("x");
         }
         if(i>coins[2]){
            x3= i/coins[2]+dp[i%coins[2]];
         //   System.out.println("x");
         }
      
        dp[i]= Math.min(Math.min(x1, x2),x3);

    }
}

System.out.println(Arrays.toString(dp));
System.out.println(dp[val]);
        
    }
}