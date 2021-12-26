package PATYiJi;
import java.io.*;

public class pat1071 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int T = (int)st.nval;
		st.nextToken();
		int K = (int)st.nval;
		int[] arr = new int[K*4];				// PAT 让我不再使用 二维数组 (´；ω；`)
		for(int i=0;i<K;i++) {
			st.nextToken();
			arr[i*4] = (int)st.nval;
			st.nextToken();
			arr[i*4+1] = (int)st.nval;
			st.nextToken();
			arr[i*4+2] = (int)st.nval;
			st.nextToken();
			arr[i*4+3] = (int)st.nval;
		}
		
		for(int i=0;i<K;i++) {
			if(T<arr[i*4+2]) System.out.println("Not enough tokens.  Total = " + T + ".");
			else if((arr[i*4]>arr[i*4+3] && arr[i*4+1]==0) || (arr[i*4]<arr[i*4+3] && arr[i*4+1]==1)) {
				T += arr[i*4+2];
				System.out.println("Win " + arr[i*4+2] + "!  Total = " + T + ".");
			}else {
				T -= arr[i*4+2];
				System.out.println("Lose " + arr[i*4+2] + ".  Total = " + T + ".");
			}
			if(T==0) {
				System.out.println("Game Over.");
				System.exit(0);
			}
		}
	}

}
