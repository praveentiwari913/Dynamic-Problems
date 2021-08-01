import java.util.*;
public class EggDrop{

static int fun(int f,int e){


if(f==0 || f==1){
    return f;
}

//if egg is 1 then at the worst case it will break at the top most floor
if(e==1){
    return f;
}

int min=Integer.MAX_VALUE;
for(int k=1;k<f;k++){

    //After f-k the problem get changes to a small problem from 0 to f-k and
    //we need to calculate number of steps so we will be fine with it
    int temp=1+Math.max(fun(k-1,e-1),fun(f-k,e));

    //Storing the minimum value
    if(temp<min){
        min=temp;
    }
}


return min;

}

    public static void main(String args[]){

int f=5;
int e=3;


int val=fun(f,e);
System.out.println(val);
    }
}