package PATYiJi;
import java.io.*;

public class pat1089 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] say = new int[N];
		for(int i=0;i<N;i++) say[i] = Integer.parseInt(br.readLine());	//读取数据
		
		for(int i=0;i<N-1;i++) for(int j=i+1;j<N;j++) {					//我们先假设两个人是狼
			int[] people = new int[N];			//对于五个人就是 12 13 14 15 23 24 25 34 35 45；
			int[] lie = new int[100];
			for(int k=0;k<N;k++) people[k] = 1;							//1表示好人
			people[i] = people[j] = -1;									//-1表示狼
			int lieTimes = 0;
			for(int k=0;k<N;k++) {										//检查说的话
				int toPeople = Math.abs(say[k])-1; 						//表示这句话说的人
				if(say[k]*people[toPeople]<0) {					//说坏人是坏人和说好人是好人结果都是正数
					lie[lieTimes] = k;
					lieTimes++;
				}
			}															//一个狼说谎，一个人说谎
			if(lieTimes==2 && people[lie[0]]+people[lie[1]]==0) {
				System.out.println((i+1) + " " + (j+1));
				System.exit(0);
			}
		}
		System.out.print("No Solution");
	}

}
