import java.util.*;
public class lcsp{

static String fun(String st1,String st2,int i,int j,int n,int m){

if(i==n || j==m){
    return "";
}

if(st1.charAt(i)==st2.charAt(j)){

    return st1.charAt(i)+fun(st1,st2,i+1,j+1,n,m);
}else{

    String b1=[fun(st1,st2,i,j,n,m)];
    
   String b2= [fun(st1,st2,i,j,n,m)];

   if(b1.length()>b2.length()){
       return b1;
   }else{
        return b2;
   }
}

}


    public static void main(String args[]){


        String st1="";

        String st2="";

        int i=0;
        int j=0;

        int n=st1.length();
        int m=st2.length();


       String ans= fun(st1,st2,i,j,n,m);
    }
}