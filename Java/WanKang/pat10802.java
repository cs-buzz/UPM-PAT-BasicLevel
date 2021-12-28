package PATYiJi;
import java.io.*;

public class pat10802 {
	
	static int flag = 0;							//用来记录arr[]到第几位了
	static Student10802[] arr = new Student10802[30000];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] arr1 = br.readLine().trim().split(" ");
		int P = Integer.parseInt(arr1[0]);
		int M = Integer.parseInt(arr1[1]);
		int N = Integer.parseInt(arr1[2]);
		for(int i=0;i<P;i++) {						//编程作业
			Student10802 stu = new Student10802();
			String[] strArr = br.readLine().trim().split(" ");
			stu.No = strArr[0];
			stu.workScore = Integer.parseInt(strArr[1]);
			arr[i] = stu;
			flag++;
		}for(int i=0;i<M;i++) {						//期中考试
			String[] strArr = br.readLine().trim().split(" ");
			String temp = strArr[0];
			if(search(temp)) {
				Student10802 stu = new Student10802();
				stu.No = temp;
				stu.midScore = Integer.parseInt(strArr[1]);
				arr[flag++] = stu;					//把数据储存进去
			}else {
				arr[find(temp)].midScore = Integer.parseInt(strArr[1]);
			}
		}for(int i=0;i<N;i++) {						//期末考试
			String[] strArr = br.readLine().trim().split(" ");
			String temp = strArr[0];
			if(search(temp)) {
				Student10802 stu = new Student10802();
				stu.No = temp;
				stu.finalScore = Integer.parseInt(strArr[1]);
				arr[flag++] = stu;					//把数据储存进去
			}else {
				arr[find(temp)].finalScore = Integer.parseInt(strArr[1]);
			}
		}
		
		int pass = 0;
		for(int i=0;i<flag;i++) {
			if(arr[i].workScore<200) continue;
			if(arr[i].midScore>arr[i].finalScore) {
				double sum = (double)arr[i].midScore * 0.4 + (double)arr[i].finalScore * 0.6;
				if(sum>=60) {
					pass++;						//记录合格人数
					arr[i].score = (int)Math.round(sum);
				}
			}else {
				if(arr[i].finalScore>=60) {
					pass++;						//记录合格人数
					arr[i].score = arr[i].finalScore;
				}
			}
		}
		for(int i=0;i<pass;i++) {
			int min = 0;
			int output = 0;
			for(int j=0;j<flag;j++) {
				if(arr[j].score>min) {
					min = arr[j].score;
					output = j;
				}else if(arr[j].score==min && arr[j].No.charAt(0)<arr[output].No.charAt(0)) output = j;
			}
			System.out.println(arr[output].No + " " + arr[output].workScore + " " + arr[output].midScore + " " + arr[output].finalScore + " " + arr[output].score);
			arr[output].score = -1;
		}
	}
	
	private static boolean search(String No) {
		for(int i=0;i<flag;i++) {
			if(arr[i].No==null) return true;
			if(No.equals(arr[i].No)) return false;
		}
		return true;
	}
	
	private static int find(String No) {
		for(int i=0;i<flag;i++)
			if(No.equals(arr[i].No)) return i;
		return -1;
	}
}

class Student10802 implements Comparable<Student10802>{
	String No;
	int workScore = -1;
	int midScore = -1;
	int finalScore = -1;
	int score = -1;
	
	@Override
	public int compareTo(Student10802 o) {
		// TODO Auto-generated method stub
		if(this.score==o.score) return this.No.compareTo(o.No);
		return o.score - this.score;
	}
}
