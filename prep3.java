import java.util.*;
public class prep3{


    public static void main(String args[]){

int st=2;
int en=6;
int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};

for(int i=0;i<arr.length;i++){


    if(arr[i]>=st && arr[i]<en){


        System.out.println(i);
    }
}


    }
}