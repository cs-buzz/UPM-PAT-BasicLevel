import java.util.Scanner;

public class PAT_1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		int n=input.nextInt();
		double max=0;
		for(int i=0;i<n;i++) {
			int a=input.nextInt();
			int b=input.nextInt();
			double num = Math.sqrt(a*a+b*b);
			if (num>max) {
				max=num;
			}
		}
		System.out.printf("%.2f\n",max);
	}
}