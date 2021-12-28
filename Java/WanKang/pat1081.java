package PATYiJi;
import java.io.*;

public class pat1081 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			int len = str.length();
			int haveNum = 0, haveChar = 0, illegal = 0;
			if(len<6) {
				out.println("Your password is tai duan le.");
				continue;
			}
			for(int j=0;j<len;j++) {
				char temp = str.charAt(j);
				if(temp=='.') continue;
				if(temp>='0' && temp<='9') haveNum++;
				else if(temp>='a' && temp<='z') haveChar++;
				else if(temp>='A' && temp<='Z') haveChar++;
				else {
					illegal++;
					out.println("Your password is tai luan le.");
					break;
				}
			}
			if(illegal!=0) continue;
			if(haveChar==0) out.println("Your password needs zi mu.");
			else if(haveNum==0) out.println("Your password needs shu zi.");
			else out.println("Your password is wan mei.");
		}
		
		out.flush();
	}

}
