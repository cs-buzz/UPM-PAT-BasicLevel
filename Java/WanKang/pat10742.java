package PATYiJi;
import java.io.*;

public class pat10742 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String num1 = Integer.parseInt(br.readLine()) + "";		//这两部不能省略
		String num2 = Integer.parseInt(br.readLine()) + "";		//用来去掉数字前面的0
		if(num1.length()>num2.length()) {				//把两个数补全到一样长
			int diff = num1.length()-num2.length();
			for(int i=0;i<diff;i++) num2 = 0 + num2;
		}if(num1.length()<num2.length()) {
			int diff = num2.length()-num1.length();
			for(int i=0;i<diff;i++) num1 = 0 + num1;
		}
		
		int N1 = num1.length();
		int N = num.length();
		if(N<=0 || N>20) System.exit(0);				//如果N过20，结束程序
		String output = "";
		int temp = 0;									//用来储存上一位的进1；
		for(int i=N1-1;i>=0;i--) {
			N--;										//先让N--，方便做下标
			int jinZhi = num.charAt(N) - '0';			//转化为一个常数
			if(jinZhi==0) jinZhi = 10;					//0变为十进制
			int temp1 = num1.charAt(i) - '0';			//提取num1的数字
			int temp2 = num2.charAt(i) - '0';			//提取num2的数字
			int sum = temp + temp1 + temp2;
			int out = sum%jinZhi;
			temp = sum/jinZhi;
			output = out + output;
		}
		if(temp!=0) output = temp + output;
		System.out.println(output);
	}

}
