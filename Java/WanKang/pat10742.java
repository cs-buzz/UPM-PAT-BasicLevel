package PATYiJi;
import java.io.*;

public class pat10742 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String num1 = Integer.parseInt(br.readLine()) + "";		//����������ʡ��
		String num2 = Integer.parseInt(br.readLine()) + "";		//����ȥ������ǰ���0
		if(num1.length()>num2.length()) {				//����������ȫ��һ����
			int diff = num1.length()-num2.length();
			for(int i=0;i<diff;i++) num2 = 0 + num2;
		}if(num1.length()<num2.length()) {
			int diff = num2.length()-num1.length();
			for(int i=0;i<diff;i++) num1 = 0 + num1;
		}
		
		int N1 = num1.length();
		int N = num.length();
		if(N<=0 || N>20) System.exit(0);				//���N��20����������
		String output = "";
		int temp = 0;									//����������һλ�Ľ�1��
		for(int i=N1-1;i>=0;i--) {
			N--;										//����N--���������±�
			int jinZhi = num.charAt(N) - '0';			//ת��Ϊһ������
			if(jinZhi==0) jinZhi = 10;					//0��Ϊʮ����
			int temp1 = num1.charAt(i) - '0';			//��ȡnum1������
			int temp2 = num2.charAt(i) - '0';			//��ȡnum2������
			int sum = temp + temp1 + temp2;
			int out = sum%jinZhi;
			temp = sum/jinZhi;
			output = out + output;
		}
		if(temp!=0) output = temp + output;
		System.out.println(output);
	}

}
