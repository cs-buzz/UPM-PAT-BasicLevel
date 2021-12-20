package PATYiJi;
import java.io.*;

public class pat1060 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().trim().split(" ");
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(str[i]); 
		
		int E = 0;
		for(E=N;E>0;E--) {
			int temp = 0;
			for(int j=0;j<N;j++) if(arr[j]>E) temp++;
			if(temp >= E) break;
		}
		System.out.println(E);
	}

}
