import java.util.*;
public class Eqlsumpart{

static boolean fun(int[] arr,int n,int sum){

if(sum==0){
    return true;
}
if(sum<0 || n==0){
    return false;
}


return fun(arr,n-1,sum-arr[n-1]) || fun(arr,n-1,sum);


}

    public static void main(String args[]){

int[] arr={1,5,11,5,8,9,8,7,1,100000,600,5000,41222,022255,854420,251132,5334};
int n=arr.length;
int sum=0;
for(int i=0;i<n;i++){


    sum=sum+arr[i];
}

if(sum%2==0){
sum=sum/2;


System.out.println(fun(arr,n,sum));}else{

    System.out.println(false);
}


    }
}