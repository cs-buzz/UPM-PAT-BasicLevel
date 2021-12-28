package PATYiJi;
import java.io.*;

public class pat1082 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int N = (int)st.nval;
		int farest = -1, nearest = 200;
		int farestID = 0, nearestID = 0;
		for(int i=0;i<N;i++) {
			st.nextToken();
			int ID = (int)st.nval;
			st.nextToken();
			int x = (int)st.nval;
			st.nextToken();
			int y = (int)st.nval;
			int distance = x*x + y*y;
			if(distance>farest) {
				farest = distance;
				farestID = ID;
			}
			if(distance<nearest) {
				nearest = distance;
				nearestID = ID;
			}
		}
		System.out.printf("%04d %04d\n",nearestID,farestID);
	}

}
