package PATYiJi;
import java.io.*;

public class pat1047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[] arr = new int[1001];			//�� i ��¼�飬��int��¼������
		int group = 0;						//��¼С�飻
		int max = 0;						//���ֵ
		for(int i=0;i<N;i++) {
			String[] str = input.readLine().split(" |-");
			group = Integer.parseInt(str[0]);
			arr[group] += Integer.parseInt(str[2]);
			if(arr[group] > arr[max]) max = group;		//�����ֵ
		}
		System.out.println(max + " " + arr[max]);
	}

}
