package PATYiJi;
import java.util.Scanner;

public class pat1056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().trim().split(" ");
		int sum = 0;
		for(int i=1;i<str.length;i++) {			//�������N=3�����֣� ��ϳ� 25 28 52 58 82 85 ���Կ���
			int num = Integer.parseInt(str[i]);	//���Կ��� 22 55 88 22 55 88
			sum += num*11;						//����ֻҪ���ÿ��������11�ĺϣ��ٳ��� N-1 �Ϳ�����
		}
		int total = sum*(str.length-2);
		System.out.println(total);
		
	}

}
