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
			int[] answers = new int[realSelec];		//��int��¼���ݸ�������
			for(int j=0;j<realSelec;j++) {
				st.nextToken();
				answers[j] = st.sval.charAt(0) - 'a';	//0=a 1=b 2=c 3=d 4=e
			}
			question[i] = new Question(fullscore, realSelec, answers);			//ֻ��¼���������������ʹ�
		}
		
		for(int i=0;i<N;i++) {
			int score = 0;
			for(int j=0;j<M;j++) {
				st.nextToken();
				int ansNum = st.sval.charAt(1) - '0';					//�õ��ж��ٸ���
				if(ansNum!=question[j].realSelec) {
					for(int k=0;k<ansNum;k++) st.nextToken();			//����ansNum����������
					question[j].wrongTimes++;
					continue;											//���ѧ���Ĵ���������ȷ��������һ����ֱ�Ӽ����һ�⣬��ʡʱ��
				}
				boolean right = true;									//�ȼٶ�����д����
				for(int k=0;k<ansNum;k++) {								//���ÿ����
					st.nextToken();
					int studentSelec = st.sval.charAt(0) - 'a';			//��ѧ���Ĵ�ת���� 0 1 2 3 4
					if(studentSelec!=question[j].answers[k]) {			//���������봢��Ĵ𰸲�һ������Ϊ�����һ���� abcde��˳��
						right = false;									//���Կ��Բ��ÿ�����forѭ��������
					}
				}
				if(right) score += question[j].fullscore;				//������ˣ���ѧ���ӷ�
				else question[j].wrongTimes++;							//������ˣ�����Ŀ��һ�δ���
			}
			System.out.println(score);									//���ѧ������
		}
		
		int max = 0;													//�ҵ����ѵ���Ŀ�Ĵ������
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
