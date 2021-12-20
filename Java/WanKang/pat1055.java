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
		int n = N/K;		//每排的人数
		People[] people = new People[N];
		
		for(int i=0;i<N;i++) {
			st.nextToken();
			String name = st.sval;
			st.nextToken();
			int high = (int)st.nval;
			people[i] = new People(name, high);
		}
		Arrays.sort(people); 		//排序
		//这行是测试排序的 ↓↓↓↓
		//for(int i=0;i<N;i++) System.out.println(people[i].name + " " + people[i].high);
		int arrTo = 0;			//记录people数组输出到了哪里，即为下一循环的开始
        int length;				//这一排的人数
        int arrFrom;			//记录从数组的第几个开始输出
        while (arrTo < N){
            arrFrom = arrTo;
            if(arrTo==0) arrTo += n+(N-K*n);	//判断是不是第一行
            else arrTo += n;
            length = arrTo-arrFrom;	
            String[] row = new String[length];	//创建一个数组来记录
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
