package PATYiJi;
import java.io.*;

public class pat1069 {
	
	static String[] winners = new String[1001];		//记录中奖者名单

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().trim().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		int S = Integer.parseInt(arr[2]);
		int winnerNum = 0;
		for(int i=1;i<=M;i++) {					//循环9次
			String name = br.readLine();
			if(i<S) continue;					//如果还没到第一个中奖人员，continue
			int loc = find(name);
			if(loc==-1) continue;				//如果已经存在，continue
			winners[loc] = name;				//把名字插入
			winnerNum++;
			System.out.println(name);
			for(int j=1;j<N;j++) {
				i++;
				String nextName = br.readLine();
			}
		}
		
		if(winnerNum==0) System.out.println("Keep going...");
		
	}
	
	private static int find(String name) {
		for(int i=0;i<1001;i++) {
			if(winners[i]==null) return i;
			if(winners[i].equals(name)) return -1;
		}
		return -1;
	}

}
