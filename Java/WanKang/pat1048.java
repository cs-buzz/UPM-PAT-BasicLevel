package PATYiJi;
import java.util.Scanner;

public class pat1048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String A = input.next();
		String B = input.next();
		String output = "";
		String[] arr = {"0","1","2","3","4","5","6","7","8","9","J","Q","K"};
		int len;
		int diff = A.length() - B.length();		//�����������ֵ�λ���
		if(diff<0) for(int i=0;i<Math.abs(diff);i++) A = "0" + A;		//���B��A�������� ��0�� ����ȫA
		else for(int i=0;i<diff;i++) B = "0" + B;						//A��B������ȫB
		
		char[] arrA = A.toCharArray(), arrB = B.toCharArray();
		len = arrA.length;
		for(int i=len-1;i>=0;i--) {
			if((len-i)%2==1) {				//�������������Ϊ��һλdiff��0��������ż�Ƿ���
				int num = (arrB[i] - '0') + (arrA[i] - '0');	//�������
				num = num%13;			//13ȡ��
				output = arr[num] + output;
			}else {
				int num = (arrB[i] - '0') - (arrA[i] - '0');	//B-A
				if(num<0) num += 10;	//������10
				output = arr[num] + output;
			}
		}
		System.out.println(output);
	}

}
