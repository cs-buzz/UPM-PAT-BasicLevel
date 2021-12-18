package PATYiJi;
import java.io.*;

public class pat1053 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] num = input.readLine().trim().split(" ");
		int N = Integer.parseInt(num[0]);
		double e = Double.parseDouble(num[1]);
		int D = Integer.parseInt(num[2]);
		
		int possible=0, empty=0;
		for(int i=0;i<N;i++) {
			String[] str = input.readLine().trim().split(" ");
			double[] arr = new double[str.length-1];
			int totalday = Integer.parseInt(str[0]);
			for(int j=0;j<totalday;j++) arr[j] = Double.parseDouble(str[j+1]);	//跳过第一个复制
			int day = 0;					//记录不足天数
			for(int j=0;j<totalday;j++) if(arr[j]<e) day++;	//如果小于 e 就 day加一
			if(day > totalday/2) {
				if(totalday > D) empty++;
				else possible++;
			}
		}
		
		System.out.printf("%.1f%% %.1f%%", possible*100.0 / N, empty*100.0 / N);
		System.out.println();
	}

}
