import java.util.Scanner;

public class APT_1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String star = input.next();
		input.close();
		
		int i,j,k;
		int sum=0;
		for(i=1;sum<=num;i++) {
			sum=2*i*i-1;
		}
		int high =i-2;
		sum=2*high*high-1;	//��������͸߶�
		int r=num-sum;
		
		for(j=high;j>0;j--) {
			if(j<high) {
				for(k=high-j;k>0;k--) {
					System.out.print(" ");//��ӡ�ո�
				}
			}
			for(i=2*j-1;i>0;i--) {
				System.out.print(star);//��ӡ�Ǻ�
			}
			System.out.println( );//����
		}
		for(j=2;j<=high;j++) {	//��������ӡ
			if(j<high) {
				for(k=high-j;k>0;k--) {
					System.out.print(" ");
				}
			}
			for(i=2*j-1;i>0;i--) {
				System.out.print(star);
			}
			System.out.println( );
		}
		System.out.println(r); //��ӡʣ�����
		
		}
		
	}


