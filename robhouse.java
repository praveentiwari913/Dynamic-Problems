import java.util.*;
public class robhouse{

static int fun(int[] ans,int i,int[] arr){


    if(i==0){
        return ans[0]=arr[0];
    }
    
    if(i==1){
        return ans[1]=Math.max(arr[0],arr[1]);
    }
  if(ans[i]!=-1){
      return ans[i];
  }
    ans[i]=Math.max((arr[i] + fun(ans,i-2,arr)),fun(ans,i-1,arr));
    return ans[i];
}


    public static void main(String args[]){


        int[] arr={6,2,4,9};
        int n=arr.length;
        int[] ans=new int[n];

        int i=n-1;
        for(int j=0;j<n;j++){
            
                ans[i]=-1;
            
                    }
        fun(ans,i,arr);
        int val=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
if(ans[i]>val){
    val=ans[i];
}
        }
        System.out.println(val);
    }
}