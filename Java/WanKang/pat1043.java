package PATYiJi;
import java.io.*;

public class pat1043 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		int[] arr = new int[6]; 	 		//用来记录 PATest 六个字符；
		
		for(int i=0;i<str.length();i++) {	//记录数据
			char chara = str.charAt(i);
			switch(chara) {
			case 'P':
				arr[0]++;
				break;
			case 'A':
				arr[1]++;
				break;
			case 'T':
				arr[2]++;
				break;
			case 'e':
				arr[3]++;
				break;
			case 's':
				arr[4]++;
				break;
			case 't':
				arr[5]++;
				break;
			}
		}
		
		int max = 0;						//找到最大运行圈数
		for(int i=0;i<6;i++) if(arr[i]>max) max = arr[i];
		
		String PATest = "PATest";
		for(int i=0;i<max;i++) {
			for(int j=0;j<6;j++) {
				if(arr[j]!=0) {
					System.out.print((char)PATest.charAt(j));
					arr[j]--;
				}
			}
		}
	}

}
