package PATYiJi;
import java.util.Scanner;
public class pat1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int A=0, B=0;		//记录 甲和乙 的喝酒次数
		for(int i=0;i<N;i++) {
			int a1 = input.nextInt();
			int a2 = input.nextInt();
			int b1 = input.nextInt();
			int b2 = input.nextInt();
			int add = a1 + b1;
			if(add==a2 && add!=b2) B++;
			if(add!=a2 && add==b2) A++;
		}
		System.out.println(A + " " + B);
	}

}
