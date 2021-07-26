import java.util.*;
public class prep{

public static void main(String args[]){



    String str="23511011501782351112179911801562340161171141148";


    String rev=new StringBuffer(str).reverse().toString();

String ans="";
String curr="";
    for(int i=0;i<rev.length();i++){

curr=curr+rev.charAt(i);

int val=Integer.parseInt(curr);

if(val >=65 && val<=90 || val>=97 && val<=122 || val==32){



    ans=ans+(char)val;
    curr="";


}



    }

    System.out.println(ans);
    int c=102;
    System.out.print((char)c);
}



}