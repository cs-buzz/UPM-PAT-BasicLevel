package PATYiJi;
import java.io.*;

public class pat1064 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] friend = new int[37];		//��Ϊ����С��10^4����������������Ϊ9*4=36��
		String[] arr = br.readLine().trim().split(" ");
		for(int i=0;i<N;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length();j++) {
				int n = arr[i].charAt(j) - '0';
				sum += n;
			}
			friend[sum]++;					//��Ӧ��λ��++
		}
		int[] output = new int[N];		//�����������
		int friends = 0;
		for(int i=0;i<37;i++) {
			if(friend[i]>0) {
				output[friends] = i;
				friends++;
			}
		}
		System.out.println(friends);
		for(int i=0;i<friends-1;i++) System.out.print(output[i] + " ");
		System.out.println(output[friends-1]);
	}

}
