package PATYiJi;
import java.io.*;

public class pat1044 {
	
	public static String[] number = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	public static String[] uppernum = {"tret", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] arr = new String[N];
		for(int i=0;i<N;i++) arr[i] = input.readLine();
		input.close();
		for(int i=0;i<N;i++) {
			char chara = arr[i].charAt(0);		//ͨ���жϵ�һ��char�ǲ������֣����ж��� ��ת�𣬻��ǻ�ת��
			if(chara>47 && chara<58) toMars(arr[i]);
			else toEarth(arr[i]);
		}
	}
	
	public static void toMars(String str) {
		int num = Integer.parseInt(str);
		if(num==0) System.out.print(number[0]);	//���������0��ֻ��� tret
		else {
			int a = num/13;		//ʮλ��
			int b = num%13;		//��λ��
			if(a==0) System.out.print(number[b]);	//���û��ʮλ������ֻ�����λ��
			else {
				System.out.print(uppernum[a]);
				if(b!=0) System.out.print(" " + number[b]); //�����λ���Ϳո�
			}
		}
		System.out.println();
	}
	
	public static void toEarth(String str) {
		String[] arr = str.split(" ");
		int num = 0;
		if(arr.length == 1) {		//���ֻ��һλ��
			if(find(number, arr[0]) > -1) num = find(number, arr[0]);	//�����һ��ֵ��number ������uppernum
			else num = find(uppernum, arr[0]) * 13;  //���13
		}else num = find(uppernum, arr[0]) * 13 + find(number, arr[1]);		//�����λ��
		System.out.println(num);
	}
	
	public static int find(String[] arr, String num) {
		for(int i=0;i<arr.length;i++) {
			if(num.equals(arr[i])) {
				return i;
			}
		}
		return -1;		//û�еĻ�����һ��Խ��ֵ��Ҳ��������û�е�λ��
	}

}
