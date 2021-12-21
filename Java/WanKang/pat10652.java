package PATYiJi;
import java.io.*;
import java.util.Arrays;

public class pat10652 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		int[] couple = new int[100000];
		for(int i=0;i<N;i++) {
			st.nextToken();
			int n1 = (int)st.nval;
			st.nextToken();
			int n2 = (int)st.nval;
			couple[n1] = n2;				//在数组位置记录伴侣
			couple[n2] = n1;
		}
		
		st.nextToken();
		int M = (int)st.nval;
		int[] attend = new int[M];			//用来记录参加人员 
		for(int i=0;i<M;i++) {
			st.nextToken();
			int m = (int)st.nval;
			attend[i] = m;
		}
		
		int[] output = new int[M];			//用来记录单身人员 
		int single = 0;						//记录单身人数
		for(int i=0;i<M;i++) {
			boolean isSingle = true;
			for(int j=0;j<M;j++) {
				if(attend[i]==couple[attend[j]]) {
					isSingle = false;
					break;
				}
			}
			if(isSingle) {
				output[single] = attend[i];
				single++;
			}
		}
		
		System.out.println(single);
		Arrays.sort(output);
		for(int i=M-single;i<M-1;i++) System.out.printf("%5d ",output[i]);
		System.out.printf("%5d\n",output[M-1]);
	}

}
