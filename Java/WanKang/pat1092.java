package PATYiJi;
import java.io.*;

public class pat1092 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int M = (int)st.nval;
		long[] arr = new long[N];
		for(int i=0;i<M;i++) for(int j=0;j<N;j++) {
			st.nextToken();
			long num = (long)st.nval;
			arr[j] += num;
		}
		
		long max = 0;
		for(int i=0;i<N;i++) if(arr[i]>max) max = arr[i];		//找到最大数字
		System.out.println(max);
		
		int num = 0;
		for(int i=0;i<N;i++) if(arr[i]==max) num++;
		
		for(int i=0;i<N;i++) if(arr[i]==max) {
			if(num==1) System.out.print(i+1);
			else System.out.print((i+1) + " ");
			num--;
		}
	}

}
