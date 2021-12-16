package PATYiJi;
import java.io.*;

public class pat1042 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int[] arr = new int[26];
		
		for(int i=0;i<str.length();i++) {
			char chara = str.charAt(i);
			if(chara>64 && chara<91) arr[chara-65]++;
			if(chara>96 && chara<123) arr[chara-97]++;
		}
		
		int loc = -1;
		int max = 0;
		for(int i=0;i<26;i++) if(arr[i]>max) {
			max = arr[i];
			loc = i;
		}
		
		char output = (char) (loc + 'a');
		System.out.println(output + " " + max);
	}

}
