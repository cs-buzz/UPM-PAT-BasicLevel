package PATYiJi;
import java.io.*;
import java.util.Scanner;

public class pat1073 {
	
	static char[] chara = {'a', 'b', 'c', 'd', 'e'};

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
		Question1073[] question = new Question1073[M];
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
			question[i] = new Question1073(fullscore, realSelec, answers);			//ֻ��¼���������������ʹ�
		}
		
		for(int i=0;i<N;i++) {
			double score = 0;
			for(int j=0;j<M;j++) {
				st.nextToken();
				int ansNum = st.sval.charAt(1) - '0';					//�õ��ж��ٸ���
				int[] ans = new int[ansNum];							//������¼��
				for(int k=0;k<ansNum;k++) {
					st.nextToken();
					ans[k] = st.sval.charAt(0) - 'a';					//��¼��Ϊ0 1 2 3 4
				}
				int[] realAns = new int[question[j].realSelec];			//������¼��ȷ�𰸣�����������
				for(int k=0;k<question[j].realSelec;k++) realAns[k] = question[j].answers[k];
				for(int k=0;k<ans.length;k++) {
					for(int l=0;l<realAns.length;l++) {
						if(ans[k]==realAns[l]) {						//���ѡ����
							ans[k] = realAns[l] = -1;					//�����������-1��
							break;										//��ʡʱ��
						}
					}
				}
				int remain1 = 0, remain2 = 0;							//��¼���������л�����Щѡ��û�б�-1
				for(int k=0;k<ans.length;k++) if(ans[k]!=-1) {
					remain1++;
					question[j].wrongTimes[ans[k]]++;
				}for(int k=0;k<realAns.length;k++) if(realAns[k]!=-1) {
					remain2++;
					question[j].wrongTimes[realAns[k]]++;
				}
				int right = 0;											//�ж϶Դ�
				if(remain1==0)	{										//���ѧ����ȫ�����������Ϊ���
					right++;
					if(remain2==0)	right++;							//����ȷ��ȫ���������ȫ��
				}
				if(right==2) score += question[j].fullscore;			//������ˣ���ѧ���ӷ�
				if(right==1) score +=((double)question[j].fullscore)/2;	//��һ��ķ�
			}
			System.out.println(score);									//���ѧ������
		}
		
		int max = 0;													//�ҵ����ѵ���Ŀ�Ĵ������
		for(int i=0;i<M;i++) {
			for(int j=0;j<5;j++) {
				if(question[i].wrongTimes[j]>max) max = question[i].wrongTimes[j];
			}
		}
		
		if(max==0) System.out.print("Too simple");
		else {
			for(int i=0;i<M;i++) {
				for(int j=0;j<5;j++) {
					if(question[i].wrongTimes[j]==max) {
						System.out.println(max + " " + (i+1) + "-" + chara[j]);
					}
				}
			}
		}
		
	}

}

class Question1073 {
	
	int fullscore;
	int realSelec;
	int[] answers;
	int[] wrongTimes = new int[5];
	
	Question1073(int fullscore, int realSelec, int[] answers){
		this.fullscore = fullscore;
		this.realSelec = realSelec;
		this.answers = answers;
	}
	
}
