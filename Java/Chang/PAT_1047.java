import java.io.*;

public class PAT_1047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[]team=new int[1001];
		int one=0, id;
		
		for(int i=0;i<n;++i) {
			String[] str=br.readLine().split(" |-");
			id=Integer.parseInt(str[0]);
			team[id]+=Integer.parseInt(str[2]);
			if(team[id]>team[one]) {
				one=id;
			}
		}
		System.out.println(one+" "+team[one]);	
	}
}