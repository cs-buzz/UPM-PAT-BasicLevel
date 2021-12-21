package PATYiJi;
import java.io.*;

public class pat10662 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int M = (int)st.nval;
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int A = (int)st.nval;
		st.nextToken();
		int B = (int)st.nval;
		st.nextToken();
		int G = (int)st.nval;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				st.nextToken();
				int num = (int)st.nval;
				if(num>=A && num<=B) System.out.printf("%03d", G);
				else System.out.printf("%03d", num);
				if(j==N-1) System.out.println();
				else System.out.print(" ");
			}
		}
	}

}
