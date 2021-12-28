package PATYiJi;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class pat10852 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		
		int schoolNum = 0;						//记录学校数量
		Map<String, School1085> map = new HashMap<String, School1085>();
		for(int i=0;i<N;i++) {
			st.nextToken();
			String No = st.sval;
			st.nextToken();
			double score = st.nval;
			st.nextToken();
			String name = st.sval.toLowerCase();
			if(No.charAt(0)=='B') score /= 1.5;
			else if(No.charAt(0)=='T') score *= 1.5;
			if(map.containsKey(name)) {
				School1085 temp = map.get(name);
				temp.score += score;
				temp.student++;
			}else {
				School1085 temp = new School1085();
				temp.name = name;
				temp.score += score;
				temp.student++;
				schoolNum++;
				map.put(name, temp);
			}
		}
		
		ArrayList<School1085> arr = new ArrayList<School1085>(map.values());
		Collections.sort(arr);
		System.out.println(schoolNum);
		int rank = 0;
		int lastScore = 0;
		for(int i=0;i<schoolNum;i++) {
			School1085 temp = arr.get(i);
			if((int)temp.score!=lastScore) rank=i;
			lastScore = (int)temp.score;
			System.out.println(rank+1 + " " + temp.name + " " + (int)temp.score + " " + temp.student);
		}
	}

}

class School1085 implements Comparable<School1085>{
	
	String name;
	double score = 0;
	int student = 0;
	
	@Override
	public int compareTo(School1085 o) {
		// TODO Auto-generated method stub
		if(this.score > o.score) return -1;
		else if(this.score < o.score) return 1;
		else {
			if(this.student > o.student) return 1;
			else if(this.student < o.student) return -1;
			else return this.name.compareTo(o.name);
		}
	}
	
}
