package PATYiJi;
import java.io.*;
import java.util.Arrays;

public class pat1055 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(input);
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int K = (int)st.nval;
		int n = N/K;		//ÿ�ŵ�����
		People[] people = new People[N];
		
		for(int i=0;i<N;i++) {
			st.nextToken();
			String name = st.sval;
			st.nextToken();
			int high = (int)st.nval;
			people[i] = new People(name, high);
		}
		Arrays.sort(people); 		//����
		//�����ǲ�������� ��������
		//for(int i=0;i<N;i++) System.out.println(people[i].name + " " + people[i].high);
		int arrTo = 0;			//��¼people����������������Ϊ��һѭ���Ŀ�ʼ
        int length;				//��һ�ŵ�����
        int arrFrom;			//��¼������ĵڼ�����ʼ���
        while (arrTo < N){
            arrFrom = arrTo;
            if(arrTo==0) arrTo += n+(N-K*n);	//�ж��ǲ��ǵ�һ��
            else arrTo += n;
            length = arrTo-arrFrom;	
            String[] row = new String[length];	//����һ����������¼
            int mid = length/2;
            for (int l = arrFrom; l < arrTo; l++) {
                mid += (int)Math.pow(-1,l-arrFrom)*(l-arrFrom);
                row[mid] = people[l].name;
            }
			for(int j=0;j<row.length-1;j++) System.out.print(row[j] + " ");
			System.out.println(row[row.length-1]);
		}
	}

}

class People implements Comparable<People> {
	String name;
	int high;
	
	public People(String name, int high) {
		this.name = name;
		this.high = high;
	}

	@Override
	public int compareTo(People peo) {
		if (this.high < peo.high) return 1;
        else if (this.high > peo.high) return -1;
        else return this.name.compareTo(peo.name);
	}
}
