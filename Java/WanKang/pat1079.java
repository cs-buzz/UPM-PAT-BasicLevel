package PATYiJi;
import java.io.*;
import java.math.BigInteger;

public class pat1079 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine());
		br.close();
		if(check(N)) {
			System.out.println(N + " is a palindromic number.");	//先检查输入的数字是不是
			System.exit(0);
		}
		boolean find = false;
		for(int i=0;i<10;i++) {
			BigInteger num = change(N);
			BigInteger sum = N.add(num);
			System.out.println(N + " + " + num + " = " + sum);		//输出
			if(check(sum)) {
				System.out.println(sum + " is a palindromic number.");
				System.exit(0);										//输出后结束程序
			}
			N = sum;
		}
		System.out.println("Not found in 10 iterations.");
	}

	private static boolean check(BigInteger N) {					//判断是不是回文数
		String n = N.toString();
		for(int i=0;i<n.length()/2;i++) {
			if(n.charAt(i)!=n.charAt(n.length()-i-1)) return false;
		}
		return true;
	}
	
	private static BigInteger change(BigInteger N) {				//倒转数字
		String n = N.toString();
		String out = "";
		for(int i=0;i<n.length();i++) out = n.charAt(i) + out;
		return new BigInteger(out);
	}

}
