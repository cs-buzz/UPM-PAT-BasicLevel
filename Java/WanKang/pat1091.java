package PATYiJi;
import java.io.*;

public class pat1091 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int M = (int)st.nval;
		int[] arr = new int[M];
		for(int i=0;i<M;i++) {
			st.nextToken();
			int n = (int)st.nval;
			String str = n + "";
			int len = str.length();
			boolean ziShouShu = false;
			for(int j=1;j<10;j++) {
				long temp = j*n*n;					//由于要用 long 来记录数字
				String tempStr = temp + "";			//所以要用 charAt 来计算后几位
				int end = 0;
				for(int k=0;k<len;k++) {
					int num = tempStr.charAt(tempStr.length()-len+k) - '0';
					end = end*10 + num;
				}
				if(end==n) {
					System.out.println(j + " " + temp);
					ziShouShu = true;
					break;
				}
			}
			if(!ziShouShu) System.out.println("No");
		}
	}

}
