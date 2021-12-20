package PATYiJi;
import java.io.*;
import java.util.Scanner;

public class pat1058 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.wordChars('(', '(');
		st.wordChars(')', ')');
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int M = (int)st.nval;
		Question[] question = new Question[M];
		for(int i=0;i<M;i++) {
			st.nextToken();
			int fullscore = (int)st.nval;
			st.nextToken();
			int selection = (int)st.nval;
			st.nextToken();
			int realSelec = (int)st.nval;
			int[] answers = new int[realSelec];		//用int记录数据更加轻量
			for(int j=0;j<realSelec;j++) {
				st.nextToken();
				answers[j] = st.sval.charAt(0) - 'a';	//0=a 1=b 2=c 3=d 4=e
			}
			question[i] = new Question(fullscore, realSelec, answers);			//只记录分数，答案数量，和答案
		}
		
		for(int i=0;i<N;i++) {
			int score = 0;
			for(int j=0;j<M;j++) {
				st.nextToken();
				int ansNum = st.sval.charAt(1) - '0';					//得到有多少个答案
				if(ansNum!=question[j].realSelec) {
					for(int k=0;k<ansNum;k++) st.nextToken();			//跳过ansNum数量的输入
					question[j].wrongTimes++;
					continue;											//如果学生的答案数量和正确答案数量不一样，直接检查下一题，节省时间
				}
				boolean right = true;									//先假定这题写对了
				for(int k=0;k<ansNum;k++) {								//检查每个答案
					st.nextToken();
					int studentSelec = st.sval.charAt(0) - 'a';			//把学生的答案转换成 0 1 2 3 4
					if(studentSelec!=question[j].answers[k]) {			//如果这个答案与储存的答案不一样，因为输入的一定是 abcde的顺序，
						right = false;									//所以可以不用考虑用for循环来检索
					}
				}
				if(right) score += question[j].fullscore;				//如果对了，给学生加分
				else question[j].wrongTimes++;							//如果错了，给题目加一次错误
			}
			System.out.println(score);									//输出学生分数
		}
		
		int max = 0;													//找到最难的题目的错误次数
		for(int i=0;i<M;i++) if(question[i].wrongTimes>max) max = question[i].wrongTimes;
		
		if(max==0) System.out.print("Too simple");
		else {
			System.out.print(max);
			for(int i=0;i<M;i++) if(question[i].wrongTimes==max) System.out.print(" " + (i+1));
		}
	}

}

class Question {
	
	int fullscore;
	int realSelec;
	int[] answers;
	int wrongTimes = 0;
	
	Question(int fullscore, int realSelec, int[] answers){
		this.fullscore = fullscore;
		this.realSelec = realSelec;
		this.answers = answers;
	}
	
}
