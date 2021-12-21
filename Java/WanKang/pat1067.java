package PATYiJi;
import java.io.*;

public class pat1067 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" ");
		String Pw = str[0];
		int N = Integer.parseInt(str[1]);
		int times = 0;
		while(times<N) {
			String input = br.readLine();
			if(input.equals("#")) System.exit(0);
			if(input.equals(Pw)) {
				System.out.println("Welcome in");
				System.exit(0);
			}else {
				times++;
				System.out.println("Wrong password: " + input);
			}
		}
		String input = br.readLine();
		if(times==N) {
			System.out.println("Account locked");
			System.exit(0);
		}
	}

}
