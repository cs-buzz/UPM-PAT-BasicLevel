package PATYiJi;
import java.io.*;

public class pat1047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[] arr = new int[1001];			//用 i 记录组，用int记录分数；
		int group = 0;						//记录小组；
		int max = 0;						//最大值
		for(int i=0;i<N;i++) {
			String[] str = input.readLine().split(" |-");
			group = Integer.parseInt(str[0]);
			arr[group] += Integer.parseInt(str[2]);
			if(arr[group] > arr[max]) max = group;		//找最大值
		}
		System.out.println(max + " " + arr[max]);
	}

}
