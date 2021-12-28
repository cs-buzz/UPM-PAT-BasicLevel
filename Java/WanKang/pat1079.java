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
			System.out.println(N + " is a palindromic number.");	//�ȼ������������ǲ���
			System.exit(0);
		}
		boolean find = false;
		for(int i=0;i<10;i++) {
			BigInteger num = change(N);
			BigInteger sum = N.add(num);
			System.out.println(N + " + " + num + " = " + sum);		//���
			if(check(sum)) {
				System.out.println(sum + " is a palindromic number.");
				System.exit(0);										//������������
			}
			N = sum;
		}
		System.out.println("Not found in 10 iterations.");
	}

	private static boolean check(BigInteger N) {					//�ж��ǲ��ǻ�����
		String n = N.toString();
		for(int i=0;i<n.length()/2;i++) {
			if(n.charAt(i)!=n.charAt(n.length()-i-1)) return false;
		}
		return true;
	}
	
	private static BigInteger change(BigInteger N) {				//��ת����
		String n = N.toString();
		String out = "";
		for(int i=0;i<n.length();i++) out = n.charAt(i) + out;
		return new BigInteger(out);
	}

}
