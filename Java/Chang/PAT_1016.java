import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PAT_1016 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
		
		String[] strs = str.split(" ");
		char[] A1 = strs[0].toCharArray();
		int B1 = Integer.parseInt(strs[1]);
		char[] A2 = strs[2].toCharArray();
		int B2 = Integer.parseInt(strs[3]);
		
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < A1.length; i++) {
			if (A1[i]-'0' == B1) {
				sum1 = sum1*10+B1;
			}	
		}
		for (int i = 0; i < A2.length; i++) {
			if (A2[i]-'0' == B2) {
				sum2 = sum2*10+B2;
			}
		}
		System.out.println(sum1+sum2);
	}

}
