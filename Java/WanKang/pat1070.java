package PATYiJi;
import java.io.*;
import java.util.Arrays;

public class pat1070 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		double[] arr = new double[N];
		for(int i=0;i<N;i++) {
			st.nextToken();
			arr[i] = st.nval;
		}
		Arrays.sort(arr);			//ÅÅÐò
		//for(int i=0;i<N;i++) System.out.println(arr[i]);
		double length = arr[0];
		for(int i=1;i<N;i++) length = (length + arr[i])/2;
		int len = (int)length;
		System.out.println(len);
	}

}
