package PATYiJi;
import java.io.*;

public class pat10842 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int d = (int)st.nval;
		st.nextToken();
		int N = (int)st.nval;
		String str = d + "";
		for(int i=1;i<N;i++) {						//少循环一次
			str = Compression(str);
		}System.out.println(str);
	}
	
	private static String Compression(String str) {
		char temp = str.charAt(0);					//默认char为 null
		String out = "";
		int num = 0;
		for(int i=0;i<str.length();i++) {
			if(temp!=str.charAt(i)) {				//如果char不同
				out+=temp;							//再加上字符
				out+=num;							//多于1时加上数组
				num = 1;							//计数归1
				temp = str.charAt(i);
			}else num++;
		}
		out+=temp;									//因为我们把输出放在下一次循环里
		out+=num;									//所以最后还要输出一次
		return out;
	}

}
