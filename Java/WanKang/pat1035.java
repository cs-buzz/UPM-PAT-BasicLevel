package PATYiJi;
import java.io.*;
import java.util.Arrays;

public class pat1035 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] str1 = input.readLine().trim().split(" ");
		String[] str2 = input.readLine().trim().split(" ");
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		for(int i=0;i<N;i++) {
			arr1[i] = Integer.parseInt(str1[i]);
			arr2[i] = Integer.parseInt(str2[i]);
		}
		//�����������˼�ǣ�����������ڡ�0��λ��ʼ��飬�Դ�������λ���бȽϣ�����ڡ�n+1��λС�ڵڡ�n��λ����Ϊ�ڡ�n+1��λ�������ҵ���ȷ��λ��
		//�鲢������ÿ�������ֽ��бȽϣ����ǰ������ִ��ں�������֣��򽻻�����0���͡�1������2���͡�3��
		boolean insert = true;	//�������ж��ǲ��뻹�ǹ鲢
		int loc = 0;
        while(arr2[loc] <= arr2[loc + 1] && loc < N){
        	loc++;				//��¼��������δ��ɵ�����
        }
        for (int j = loc + 1; j < N; j++) {
            if (arr1[j] != arr2[j]) {
                insert = false;	//�����������Ƿ�һ�£�����б䣬���ǹ鲢�����δ�䣬���ǲ��룻
                break;
            }
        }
		
		if(insert) {
			System.out.print("Insertion Sort\n");
			sort(arr1, 0, loc + 1);
		}else {
			System.out.print("Merge Sort\n");
            int cache = 1;
            boolean flag = false;
            while (flag == false) {
                flag = Arrays.equals(arr1, arr2);
                cache = cache * 2;
                int p = 0;
                for (p = 0; p < N / cache; p++) sort(arr1, p * cache, (p + 1) * cache - 1);
                sort(arr1, N / cache * cache, N - 1);
			}
		}
		for (int i = 0; i < N - 1; i++) System.out.print(arr1[i] + " ");
        System.out.print(arr1[N - 1]);
	}
	
	public static void sort(int[] arr, int from, int to) {
        for (int i = from; i < to; i++) {
            for (int j = i + 1; j <= to; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
