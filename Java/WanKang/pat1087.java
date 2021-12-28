package PATYiJi;
import java.io.*;

public class pat1087 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		int count = 0;
		int lastOut = -1;
		for(int i=1;i<=N;i++) {
			int out = i/2 + i/3 + i/5;
			if(out!=lastOut) count++;
			lastOut = out;
		}
		System.out.println(count);
	}

}
