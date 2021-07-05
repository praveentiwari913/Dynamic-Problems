import java.util.*;
public class numberofcoinsBU{


static int fun(int x,int[] dp){



    if(x==1 || x==5 || x==7){
        return 1;
    }
    if(x==0){
        return 0;
    }
int x1=Integer.MAX_VALUE;
int x2=Integer.MAX_VALUE;
int x3=Integer.MAX_VALUE;
    if(x>=5){
        x1=x/5+fun(x%5);
    }
    if(x>=7){
        x2=x/7+fun(x%7);
    }
    x3=x;


return (Math.min(Math.min(x1,x2),x3));

}
    public static void main(String args[]){


int x=11;

        int[] dp=new int[x+1];

       int val= fun(x,dp);
       System.out.println(val);
    }
}