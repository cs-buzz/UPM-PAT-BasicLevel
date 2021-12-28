package PATYiJi;
import java.io.*;

public class pat1086 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int A = (int)st.nval;
		st.nextToken();
		int B = (int)st.nval;
		String C = A*B + "";
		int out = 0;
		for(int i=C.length()-1;i>=0;i--) {
			out = out*10 + C.charAt(i) - '0';
		}
		System.out.println(out);
	}

}
