package PATYiJi;
import java.util.Scanner;

public class pat1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String chara = input.next();
		int row = (int)Math.round(N/2.0);
		for(int i=0;i<row;i++) {
			for(int j=0;j<N;j++) {
				if(i==0 || i==row-1) System.out.print(chara);
				else if(j==0 || j==N-1) System.out.print(chara); 
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
