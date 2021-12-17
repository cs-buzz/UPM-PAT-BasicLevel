package PATYiJi;
import java.io.*;
import java.util.Arrays;

public class pat10452 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] str = input.readLine().split(" ");
		int[] arr = new int[N];
		int[] num = new int[N];			
		for(int i=0;i<N;i++) num[i] = arr[i] = Integer.parseInt(str[i]);		//复制数组
		Arrays.sort(num);		//给数组排序
		
		int[] out = new int[N];		//用于记录要输出的值
		int max = 0, outLoc = 0;	//记录输出的位置
		for(int i=0;i<N;i++) {
			if(arr[i]==num[i] && arr[i]>max) {
				out[outLoc] = arr[i];
				outLoc++;
			}
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println(outLoc); 		//输出 有几个数字；
		for(int i=0;i<outLoc-1;i++) System.out.print(out[i] + " ");
		System.out.println(out[outLoc-1]);
	}

}
