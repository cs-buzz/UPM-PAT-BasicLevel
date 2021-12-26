package PATYiJi;
import java.io.*;

public class pat1069 {
	
	static String[] winners = new String[1001];		//��¼�н�������

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().trim().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		int S = Integer.parseInt(arr[2]);
		int winnerNum = 0;
		for(int i=1;i<=M;i++) {					//ѭ��9��
			String name = br.readLine();
			if(i<S) continue;					//�����û����һ���н���Ա��continue
			int loc = find(name);
			if(loc==-1) continue;				//����Ѿ����ڣ�continue
			winners[loc] = name;				//�����ֲ���
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
