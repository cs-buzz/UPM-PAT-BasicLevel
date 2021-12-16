package PATYiJi;
import java.io.*;

public class pat1039 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String sell = input.readLine();
		String want = input.readLine();
		
		int[] arr = new int[128]; 		//用来记录 ASCII 的位置；
		for(int i=0;i<sell.length();i++) arr[sell.charAt(i)]++;		//每识别以为，加一
		boolean buy = true;				//用boolean值记录买不买
		int less = 0;					//less 记录少了几个
		for(int i=0;i<want.length();i++) {
			if(arr[want.charAt(i)] != 0) arr[want.charAt(i)]--;		//每识别一个，减一
			else {
				less++;				//不足，加一
				buy = false;		//不买
			}
		}
		
		if(buy) System.out.println("Yes " + (sell.length()-want.length()));
		else System.out.println("No " + less);
	}

}
