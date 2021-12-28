package PATYiJi;
import java.io.*;

public class pat1088 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int M = (int)st.nval;
		st.nextToken();
		int X = (int)st.nval;
		st.nextToken();
		int Y = (int)st.nval;
		int outA = 0, outB = 0;
		double outC = 0;
		for(int i=99;i>9;i--) {				//循环,甲是固定两位数
			int A = i;						//得到A，甲的能力值
			int B = (A%10)*10 + A/10;		//B是乙的能力值
			int mines = A-B;				//得到差值
			if(mines<0) mines = 0 - mines;	//绝对值
			double C1 = (double)B/(double)Y;
			double C2 = (double)mines/(double)X;
			if(C1==C2) {
				outA = A;
				outB = B;
				outC = C1;
				break;
			}
		}
		if(outA==0) {
			System.out.println("No Solution");
			System.exit(0);
		}
		System.out.print(outA);
		if(outA>M) System.out.print(" Cong");
		else if(outA==M) System.out.print(" Ping");
		else System.out.print(" Gai");
		if(outB>M) System.out.print(" Cong");
		else if(outB==M) System.out.print(" Ping");
		else System.out.print(" Gai");
		if(outC>M) System.out.print(" Cong");
		else if(outC==M) System.out.print(" Ping");
		else System.out.print(" Gai");
	}

}
