package PATYiJi;
import java.io.*;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

public class pat1090 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int M = (int)st.nval;
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		for(int i=0;i<N;i++) {
			st.nextToken();
			int num1 = (int)st.nval;
			st.nextToken();
			int num2 = (int)st.nval;
			if(map.containsKey(num1)) map.get(num1).add(num2);		//如果num1在map中，直接加一个num2
			else {
				Set<Integer> temp = new HashSet<Integer>();			//如果没有num1，在加一个
				temp.add(num2);
				map.put(num1, temp);
			}if(map.containsKey(num2)) map.get(num2).add(num1);		//两个数反这来一边
			else {
				Set<Integer> temp = new HashSet<Integer>();
				temp.add(num1);
				map.put(num2, temp);
			}
		}
		for(int i=0;i<M;i++) {
			st.nextToken();
			int num = (int)st.nval;
			boolean safe = true;
			Set<Integer> set = new HashSet<Integer>();
			for(int j=0;j<num;j++) {
				st.nextToken();
				int num1 = (int)st.nval;
				if(map.containsKey(num1)) {
					if(set.contains(num1))safe = false;
					else set.addAll(map.get(num1));
				}
			}
			if(safe) System.out.println("Yes");
			else System.out.println("No");
		}
	}

}
