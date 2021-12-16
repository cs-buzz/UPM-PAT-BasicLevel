package PATYiJi;
import java.io.*;

public class pat1041 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		Long[][] arr = new Long[N][3];
		for(int i=0;i<N;i++) {
			String[] str = input.readLine().split(" ");
			arr[i][0] = Long.parseLong(str[0]);
			arr[i][1] = Long.parseLong(str[1]);
			arr[i][2] = Long.parseLong(str[2]);
		}
		int M = Integer.parseInt(input.readLine());
		if(M>N) System.exit(0);
		String[] stu = input.readLine().split(" ");
		for(int i=0;i<M;i++) {
			int shiji = Integer.parseInt(stu[i]);
			for(int j=0;j<N;j++) {
				if(arr[j][1]==shiji) {
					System.out.println(arr[j][0] + " " + arr[j][2]);
					break;
				}
			}
		}
	}

}
