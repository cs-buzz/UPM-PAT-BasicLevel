package PATYiJi;
import java.io.*;

public class pat1062 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" |/");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++) arr[i] = Integer.parseInt(str[i]);
		if(arr[0]*arr[3]>arr[2]*arr[1]) {			//第一个分子*第二个分母 》 第二个分子*第一个分母
			int temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;				//交换分子
			temp = arr[1];
			arr[1] = arr[3];
			arr[3] = temp;				//交换分母
		}
		int num = 1;
		boolean gongYueShu = false;
		while(arr[0]*arr[4]>=arr[1]*num) num++;
		while(arr[0]*arr[4]<arr[1]*num && arr[3]*num<arr[2]*arr[4]) {
			if(gcd(arr[4], num)==1) {
				System.out.printf("%s%d/%d", gongYueShu==true ? " " : "", num, arr[4]);
				gongYueShu = true;
			}
			num++;
		}
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a%b);
	}

}
