import java.util.*;
public class targetsum{

static int fun(int[] arr,int tar,int n,int sum){



    if(sum==1 && n==0){

        return 1;
    }

    if(n==0){
        return 0;
    }


    return fun(arr,tar,n-1,sum-arr[n-1])+fun(arr,tar,n-1,sum+arr[n-1]);
}


    public static void main(String args[]){


int[] arr={1,1,2,3};
int tar=1;

int n=arr.length;
int sum=0;
int val=fun(arr,tar,n,sum);
System.out.println(val);

    }
}