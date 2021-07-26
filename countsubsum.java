import java.util.*;
public class countsubsum{


static int fun(int[] arr,int n,int sum){

if(sum==0){
    return 1;
}
if(n==0 || sum<0){
    return 0;
}

return fun(arr,n-1,sum-arr[n-1])+fun(arr,n-1,sum);
}


    public static void main(String args[]){



        int[] arr={2,3,5,6,8,10};
        int sum=10;

        int n=arr.length;

        int val=fun(arr,n,sum);

        System.out.println(val);
    }
}