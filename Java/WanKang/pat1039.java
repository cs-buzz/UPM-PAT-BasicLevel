package PATYiJi;
import java.io.*;

public class pat1039 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String sell = input.readLine();
		String want = input.readLine();
		
		int[] arr = new int[128]; 		//������¼ ASCII ��λ�ã�
		for(int i=0;i<sell.length();i++) arr[sell.charAt(i)]++;		//ÿʶ����Ϊ����һ
		boolean buy = true;				//��booleanֵ��¼����
		int less = 0;					//less ��¼���˼���
		for(int i=0;i<want.length();i++) {
			if(arr[want.charAt(i)] != 0) arr[want.charAt(i)]--;		//ÿʶ��һ������һ
			else {
				less++;				//���㣬��һ
				buy = false;		//����
			}
		}
		
		if(buy) System.out.println("Yes " + (sell.length()-want.length()));
		else System.out.println("No " + less);
	}

}
