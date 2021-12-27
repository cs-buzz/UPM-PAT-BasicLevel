package PATYiJi;
import java.io.*;

public class pat1078 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String chara = br.readLine();
		String str = br.readLine();
		if(chara.charAt(0)=='C') Compression(str);
		else if(chara.charAt(0)=='D') Decompression(str);
	}
	
	public static void Compression(String str) {
		char temp = str.charAt(0);					//默认char为 null
		int num = 0;
		for(int i=0;i<str.length();i++) {
			if(temp!=str.charAt(i)) {				//如果char不同
				if(num>1) System.out.print(num);	//多于1时加上数组
				System.out.print(temp);				//再加上字符
				num = 1;							//计数归1
				temp = str.charAt(i);
			}else num++;
		}
		if(num>1) System.out.print(num);			//因为我们把输出放在下一次循环里
		System.out.print(temp);						//所以最后还要输出一次
	}
	
	public static void Decompression(String str) {
		int num = 0;
		for(int i=0;i<str.length();i++) {
			char temp = str.charAt(i);
			if(temp>='0' && temp<='9') {
				num = num*10 + temp - '0';			//这么写是为了判断10以及更大的数字
			}else {
				if(num==0) System.out.print(temp);
				else {
					for(int j=0;j<num;j++) System.out.print(temp);
					num = 0;						//num 归零
				}
			}
		}
	}

}
