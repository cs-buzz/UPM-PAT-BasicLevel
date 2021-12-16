package PATYiJi;
import java.io.*;

public class pat1040 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		char[] chara = input.readLine().toCharArray();
		long P=0, A=0, T=0;
		
		for(int i=0;i<chara.length;i++) {
			if(chara[i] == 'P') P++;
			else if(chara[i] == 'A') A = (P+A)%1000000007;
			else T = (A+T)%1000000007;
		}
		System.out.println(T);
	}

}
