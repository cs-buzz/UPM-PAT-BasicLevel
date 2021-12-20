package PATYiJi;
import java.io.*;

public class pat10592 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] id = new int[N];					//��ά����ǳ���ʱ��
		boolean[] checked = new boolean[N];		//��Ըʹ������һλ����
		for(int i=0;i<N;i++) id[i] = Integer.parseInt(br.readLine());	//��¼����
		int K = Integer.parseInt(br.readLine());
		for(int i=0;i<K;i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.printf("%04d: ", num);
			int loc = -1;							//��¼�����λ��
			for(int j=0;j<N;j++) if(num==id[j]) loc = j;
			
			if(loc==-1) {
				System.out.println("Are you kidding?");
				continue;
			}
			
			if(checked[loc]) {
				System.out.println("Checked");
				continue;
			}
			else checked[loc] = true;
			
			loc++;
			if(loc==1) System.out.println("Mystery Award");
			else {
				boolean isprime = true;
				for (int k=2;k<=Math.sqrt(loc);k++) {
	                if (loc%k==0){
	                	isprime = false;
	                	break;
	                }
	            }
				if(isprime) System.out.println("Minion");
				else System.out.println("Chocolate");
			}
		}
	}

}
