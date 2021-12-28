package PATYiJi;
import java.io.*;

public class pat1083 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		int[] arr = new int[N];				//记录差值次数
		for(int i=1;i<N+1;i++) {
			st.nextToken();
			int num = (int)st.nval;
			int minue = num - i;
			if(minue<0) minue = -minue;
			arr[minue]++;
		}
		for(int i=N-1;i>=0;i--) {
			if(arr[i]>1) System.out.println(i + " " + arr[i]);
		}
	}

}
