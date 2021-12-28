package PATYiJi;
import java.io.*;

public class pat1093 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = A + br.readLine();
		boolean[] neverSee = new boolean[128];
		for(int i=0;i<B.length();i++) {
			char temp = B.charAt(i);
			if(!neverSee[temp]) {
				System.out.print(temp);
				neverSee[temp] = true;
			}
		}
	}

}
