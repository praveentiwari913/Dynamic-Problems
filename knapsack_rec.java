import java.util.*;
public class knapsack_rec{

static int fun(int[] w,int[] v,int B,int n){



    if(n==0 || B==0){
        return 0;
    }
 
if(w[n]<=B){


    return  Math.max(v[n]+fun(w,v,B-w[n],n-1),fun(w,v,B,n-1));
    
}else if(w[n]>B){

return fun(w,v,B,n-1);


}


return 0;
}

    public static void main(String args[]){



        int[] w={10,25,3,50,60,8,20,50,40,60,2};
        int[] v={1,02,12,50,13,500,100,552,896,852,53};


        int B=100;

int n=w.length;
int[] dp=new int[n];
int ans=fun(w,v,B,n-1);
System.out.println(ans);

    }
}