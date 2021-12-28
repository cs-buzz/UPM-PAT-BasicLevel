package PATYiJi;
import java.io.*;

public class pat1089 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] say = new int[N];
		for(int i=0;i<N;i++) say[i] = Integer.parseInt(br.readLine());	//��ȡ����
		
		for(int i=0;i<N-1;i++) for(int j=i+1;j<N;j++) {					//�����ȼ�������������
			int[] people = new int[N];			//��������˾��� 12 13 14 15 23 24 25 34 35 45��
			int[] lie = new int[100];
			for(int k=0;k<N;k++) people[k] = 1;							//1��ʾ����
			people[i] = people[j] = -1;									//-1��ʾ��
			int lieTimes = 0;
			for(int k=0;k<N;k++) {										//���˵�Ļ�
				int toPeople = Math.abs(say[k])-1; 						//��ʾ��仰˵����
				if(say[k]*people[toPeople]<0) {					//˵�����ǻ��˺�˵�����Ǻ��˽����������
					lie[lieTimes] = k;
					lieTimes++;
				}
			}															//һ����˵�ѣ�һ����˵��
			if(lieTimes==2 && people[lie[0]]+people[lie[1]]==0) {
				System.out.println((i+1) + " " + (j+1));
				System.exit(0);
			}
		}
		System.out.print("No Solution");
	}

}
