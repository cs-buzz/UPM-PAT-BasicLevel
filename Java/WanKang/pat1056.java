package PATYiJi;
import java.util.Scanner;

public class pat1056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().trim().split(" ");
		int sum = 0;
		for(int i=1;i<str.length;i++) {			//例题给的N=3个数字， 组合出 25 28 52 58 82 85 可以看作
			int num = Integer.parseInt(str[i]);	//可以看作 22 55 88 22 55 88
			sum += num*11;						//所以只要算出每个数乘以11的合，再乘以 N-1 就可以了
		}
		int total = sum*(str.length-2);
		System.out.println(total);
		
	}

}
