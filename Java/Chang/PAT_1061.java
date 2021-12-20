import java.util.Scanner;

public class PAT_1061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int score[]=new int[m];
		int [] a=new int[m];//ÓÃÀ´´æ´ğ°¸
		
		for(int i=0;i<m;i++) {
			score[i]=input.nextInt();
		}
		for(int i=0;i<m;i++) {
			a[i]=input.nextInt();
		}
			
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				int b =input.nextInt();		
				if(b==a[j]) {
					sum+=score[j];
				}
			}
			System.out.println(sum);
		}	
	}
}