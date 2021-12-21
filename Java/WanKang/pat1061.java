package PATYiJi;
import java.io.*;

public class pat1061 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String[] strScore = br.readLine().trim().split(" ");
		String[] strAns = br.readLine().trim().split(" ");
		int[] scores = new int[M];
		int[] ans = new int[M];
		for(int i=0;i<M;i++) {
			scores[i] = Integer.parseInt(strScore[i]);
			ans[i] = Integer.parseInt(strAns[i]);
		}
		for(int i=0;i<N;i++) {
			int score = 0;
			String[] answers = br.readLine().trim().split(" ");
			for(int j=0;j<M;j++) {
				if(ans[j]==Integer.parseInt(answers[j])) score += scores[j];
			}
			System.out.println(score);
		}
		
	}

}
