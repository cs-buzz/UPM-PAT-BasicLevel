package PATYiJi;
import java.io.*;

public class pat1077 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int M = (int)st.nval;
		for(int i=0;i<N;i++) {
			st.nextToken();
			double teacher = st.nval;
			double max = 0;
			double min = M;
			double total = 0;
			int avail = 0;
			for(int j=0;j<N-1;j++) {
				st.nextToken();
				double score = st.nval;
				if(score>M || score<0) continue;
				total += score;						//总分
				avail++;							//有效分数个数
				if(score>max) max = score;			//找最大
				if(score<min) min = score;			//找最小
			}
			avail -= 2;								//去掉两个有效个数
			total = total - max - min;				//去掉最大分最小分
			double score = (total/avail + teacher)/2;
			long output = Math.round(score);
			System.out.println(output);
		}
	}

}
