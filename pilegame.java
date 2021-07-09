import java.util.*;
public class pilegame{



    public static void main(String args[]){

int[] arr={2,3};
int pile=5;
int[] states=new int[pile+1];

for(int i=0;i<states.length;i++){


    for(int val :arr){

        if(val>i){
            continue;
        }
        if(states[i-val]==0){
            states[i]=1;
        }
    }
}

System.out.println((states[pile]==1)?"First":"Second");
    }
}