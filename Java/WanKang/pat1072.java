package PATYiJi;
import java.io.*;

public class pat1072 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().trim().split(" ");
		int N = Integer.parseInt(arr1[0]);
		int M = Integer.parseInt(arr1[1]);
		String[] arr2 = br.readLine().trim().split(" ");
		int studentNum = 0, banNum = 0;				//用来记录被查到的学生数量和违禁品数量
		for(int i=0;i<N;i++) {
			int num = 0;
			String[] arr = br.readLine().trim().split(" ");
			String output = arr[0] + ":";
			for(int j=1;j<arr.length;j++) {
				for(int k=0;k<arr2.length;k++) {
					if(arr[j].equals(arr2[k])) {
						num++;
						output = output + " " + arr[j];
					}
				}
			}
			if(num!=0) {
				studentNum++;
				banNum += num;
				System.out.println(output);
			}
		}
		System.out.println(studentNum + " " + banNum);
	}

}
