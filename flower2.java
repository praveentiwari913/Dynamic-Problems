import java.util.*;
public class flower2{

static int fun(int n,int k){


    if(n==0){

        return 1;
    }
    if(n<0){
        return 0;
    }

return fun(n-1,k)+fun(n-k,k);


}

    public static void main(string args[]){



        int n=4;
        int k=2;
       int val= fun(n,k);

       System.out.println(val);
    }
}