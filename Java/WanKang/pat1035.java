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
		//插入排序的意思是，首先由数组第【0】位开始检查，以此与后面的位就行比较，如果第【n+1】位小于第【n】位，则为第【n+1】位的数字找到正确的位置
		//归并排序，是每两个数字进行比较，如果前面的数字大于后面的数字，则交换，【0】和【1】，【2】和【3】
		boolean insert = true;	//首先先判断是插入还是归并
		int loc = 0;
        while(arr2[loc] <= arr2[loc + 1] && loc < N){
        	loc++;				//记录出现排序未完成的数字
        }
        for (int j = loc + 1; j < N; j++) {
            if (arr1[j] != arr2[j]) {
                insert = false;	//检查后续数字是否一致，如果有变，则是归并，如果未变，则是插入；
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
