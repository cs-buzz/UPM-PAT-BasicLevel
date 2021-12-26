package PATYiJi;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class pat1068 {
	
	public static int[][] cube = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
	static int M;
	static int N;
	static int TOL;
	static int[][] view = new int[1001][1001];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		Map<Integer, Integer> map = new HashMap<>();
		st.nextToken();
		M = (int)st.nval;
		st.nextToken();
		N = (int)st.nval;
		st.nextToken();
		TOL = (int)st.nval;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				st.nextToken();
				view[i][j] = (int)st.nval;
				if(map.containsKey(view[i][j])) map.put(view[i][j], map.get(view[i][j]) + 1);
				else map.put(view[i][j], 1);			//判断 map 里是否有该值。
			}
		}
		
		int n=0, m=0, differe=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map.get(view[i][j])==1) {			//只出现过一次的颜色。
					if(find(i, j)) {
						differe++;							//不同点数量
						n=i+1;
						m=j+1;
					}
				}
			}
		}
		
		if (differe==0) System.out.println("Not Exist");
        else if (differe==1) System.out.printf("(%d, %d): %d", m, n, view[n-1][m-1]);
        else System.out.println("Not Unique");
	}
	
	private static boolean find(int i, int j) {
		for(int k=0;k<8;k++) {
			int x = i + cube[k][0];		//定位
            int y = j + cube[k][1];		//定位
            if (x >= 0 && x < N && y >= 0 && y < M && view[i][j] - view[x][y] >= 0 - TOL && view[i][j] - view[x][y] <= TOL) return false;
		}
		return true;
	}

}
