package PATYiJi;
import java.io.*;

public class pat1057 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine().toLowerCase();
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			char chara = str.charAt(i);
			if(chara>96 && chara<123) sum += chara-96;
		}
		if(sum==0) System.exit(0);
		String binary = Integer.toBinaryString(sum);
		int num0=0, num1=0;
		while(sum!=0) {
			if(sum%2==0) num0++;
			else num1++;
			sum = sum/2;
		}
		System.out.println(num0 + " " + num1);
	}

}
