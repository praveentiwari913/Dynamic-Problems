import java.util.*;
public class knapsack1{

static boolean fun(int[] arr,int i,int target){

if(target==0 ){

    return true;
}
if(target<0 || i==arr.length){
    return false;
}


return fun(arr,i+1,target-arr[i]) || fun(arr,i+1,target);

}

    public static void main(String args[]){

           int[] arr={2,3,7,8,10};
int target=11;
int i=0;
    System.out.println(fun(arr,i,target));


    }
}