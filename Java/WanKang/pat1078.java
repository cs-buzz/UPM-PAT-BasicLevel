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
		char temp = str.charAt(0);					//Ĭ��charΪ null
		int num = 0;
		for(int i=0;i<str.length();i++) {
			if(temp!=str.charAt(i)) {				//���char��ͬ
				if(num>1) System.out.print(num);	//����1ʱ��������
				System.out.print(temp);				//�ټ����ַ�
				num = 1;							//������1
				temp = str.charAt(i);
			}else num++;
		}
		if(num>1) System.out.print(num);			//��Ϊ���ǰ����������һ��ѭ����
		System.out.print(temp);						//�������Ҫ���һ��
	}
	
	public static void Decompression(String str) {
		int num = 0;
		for(int i=0;i<str.length();i++) {
			char temp = str.charAt(i);
			if(temp>='0' && temp<='9') {
				num = num*10 + temp - '0';			//��ôд��Ϊ���ж�10�Լ����������
			}else {
				if(num==0) System.out.print(temp);
				else {
					for(int j=0;j<num;j++) System.out.print(temp);
					num = 0;						//num ����
				}
			}
		}
	}

}
