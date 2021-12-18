package PATYiJi;
import java.io.*;
import java.util.Arrays;
public class pat10502 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[] arr = new int[N];
		String[] str = input.readLine().trim().split(" ");
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(str[i]);
		Arrays.sort(arr);			//��������
		
		int m=0, n=0, min=10001;	//����m��n
		for(int i=1;i<=Math.sqrt(N);i++) {
			if(N%i==0) {
				int temp = N/i;
				if(min > temp-i) {		//�Ƚϲ�ֵ
					min = temp-i;		//�����ֵ
					m = temp;
					n = i;				//�õ� m �� n
				}
			}
		}
		int[][] output = new int[m][n];		//������ά����
		int locM=0, locN=-1;					//������¼����Ӧ�ô����λ��		�������������ߣ���һ��λ����output[0][0] ������ʼλ����output[0][-1]
		int path = 1;			//��Ϊ·��Ӧ���� �� �� �� �� �� �� ��   ���������� path ����¼ 1.�� 2.�� 3.�� 4.��
		for(int i=N-1;i>=0;i--) {
			if(path==1 && (locN+1==n || output[locM][locN+1]!=0)) path++;		//��ת��
			if(path==2 && (locM+1==m || output[locM+1][locN]!=0)) path++;		//��ת��
			if(path==3 && (locN-1==-1 || output[locM][locN-1]!=0)) path++;		//��ת��
			if(path==4 && (locM-1==-1 || output[locM-1][locN]!=0)) path=1;		//��ת��
			
			switch(path) {			//�������λ���ƶ�
			case 1:
				locN++;
				break;
			case 2:
				locM++;
				break;
			case 3:
				locN--;
				break;
			case 4:
				locM--;
				break;
			}
			output[locM][locN] = arr[i];			//����
		}
		for (int i=0;i<m;i++) {
            for (int j=0;j<n-1;j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println(output[i][n - 1]);
        }
	}

}
