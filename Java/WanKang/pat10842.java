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
		for(int i=1;i<N;i++) {						//��ѭ��һ��
			str = Compression(str);
		}System.out.println(str);
	}
	
	private static String Compression(String str) {
		char temp = str.charAt(0);					//Ĭ��charΪ null
		String out = "";
		int num = 0;
		for(int i=0;i<str.length();i++) {
			if(temp!=str.charAt(i)) {				//���char��ͬ
				out+=temp;							//�ټ����ַ�
				out+=num;							//����1ʱ��������
				num = 1;							//������1
				temp = str.charAt(i);
			}else num++;
		}
		out+=temp;									//��Ϊ���ǰ����������һ��ѭ����
		out+=num;									//�������Ҫ���һ��
		return out;
	}

}
