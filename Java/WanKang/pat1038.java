package PATYiJi;
import java.io.*;

public class pat1038 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] str = input.readLine().split(" ");
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(str[i]);
		String[] str1 = input.readLine().split(" ");
		int M = Integer.parseInt(str1[0]);
		int[] score = new int[M];
		int[] output = new int[M];
		for(int i=0;i<M;i++) score[i] = Integer.parseInt(str1[i+1]);
		
		for(int i=0;i<M;i++) for(int j=0;j<N;j++) if(score[i]==arr[j]) output[i]++;
		
		for(int i=0;i<M-1;i++) System.out.print(output[i] + " ");
		System.out.println(output[M-1]);
	}

}
