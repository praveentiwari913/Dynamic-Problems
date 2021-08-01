import java.util.*;
public class PALPAT{

static int fun(String str,int i,int j){


    if(i<=j){
        return 0;
    }
    if(ispal(str,i,j)){
        return 0;
    }
int min=Integer.MAX_VALUE;
    for(int k=0;k<j-1;j++){

        int temp=fun(str,i,k)+fun(str,k+1,j)+1;
        if(temp<min){
            min=temp;
        }
    }
    return min;
}

    public static void main(String args[]){



        String str="nitin";

        int i=0;
        int j=str.length()-1;

        int val=fun(str,i,j);
        System.out.println(val);
    }
}