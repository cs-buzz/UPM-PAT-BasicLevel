package PATYiJi;
import java.io.*;

public class pat1094 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		String n = br.readLine();
		String temp;
		boolean flag = false;
		for (int i=K;i<=N;i++) {
			int s = i - K;
			temp = n.substring(s, i);
			flag=isPrime(Integer.parseInt(temp));
			if(flag) {
				System.out.print(temp);
				break;
			}
		}
		if(!flag) System.out.print("404");
	}

	static boolean isPrime(int a) {
		if(a==0) return false;
		if(a==1) return false;
		if(a==2) return true;
		for(int i=2;i<Math.sqrt(a);i++) if(a%i==0) return false;
		return true;
	}

}
