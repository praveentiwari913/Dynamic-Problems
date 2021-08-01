import java.util.*;
public class Scrmst{

static boolean fun(String st1,String st2){

        if(st1.length()<1 || st2.length()<1){
            return false;
        }


boolean flag=false;

for(int i=1;i<st1.length()-1;i++){


    if((if(fun(st1.substring(0,i),st2.substring(0,i)) && fun(st1.substring(i+1,j),st2.substring(i+1,j)) ){return true;}else{return false;}|| (if(fun(st1.substring(0,i),st2(i+1,j)) && fun(st1.substring(i+1,j),substring(0,i)))))){


flag= true;
break;
    }
}

return flag;
}

    public static void main(String args[]){


        String st1="great";
        String st2="rgeat";

        System.out.println(fun(st1,st2));
    }
}