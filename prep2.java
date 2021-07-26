import java.util.*;
public class prep2{



    public static void main(String args[]){

HashSet<String> set=new HashSet<String>();
        String[] st={"alex","xylos","alex","alan"};

int val=1;

        for(int i=0;i<st.length;i++){


            if(set.contains(st[i])==false){
                set.add(st[i]);
            }else{

             String ans=st[i]+String.valueOf(val);
               val++;
               set.add(ans);

            }
        }

        String[] fin=new String[set.size()];
 fin=set.toArray(fin);
System.out.println(Arrays.toString(fin));
    }
}