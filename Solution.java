// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Solution {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args)
	{
		FastReader key = new FastReader();
		
		int T=key.nextInt();

        for(int k=0;k<T;k++){

           String s1=key.nextLine();
       //    String s2=(key.nextLine());

String[] str=s1.split(" ");
//String[] str2=s2.split(" ");

int sum=0;
for(int i=0;i<2;i++){
sum=sum+Integer.parseInt(str[i]);
}
if(sum!=6){
int val=6-sum;
//System.out.println(val);

double ans=(double)val/6;


String num = String.format("%.7f", ans);

num = num.substring(0, num.length() - 1);
System.out.println(Double.parseDouble(num));}

        else{
            System.out.println(0);
        }


        }
	}
}
