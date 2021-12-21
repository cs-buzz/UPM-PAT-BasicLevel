package PATYiJi;
import java.io.*;

public class pat1063 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		double max = 0;
		for(int i=0;i<N;i++) {
			st.nextToken();
			int a = (int)st.nval;
			st.nextToken();
			int b = (int)st.nval;
			double temp = Math.sqrt(a*a + b*b);
			if(temp>max) max = temp;
		}
		System.out.printf("%.2f\n", max);
	}

}
