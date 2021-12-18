package PATYiJi;
import java.io.*;
public class pat10492 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st=new StreamTokenizer(input);
		st.nextToken();
		int N = (int)st.nval;
		double[] arr = new double[N];
		double sum = 0.0;
		for(int i=0;i<N;i++) {
			st.nextToken();
			sum += (st.nval)*(i+1)*(N-i);
		}
		System.out.printf("%.02f",sum);
	}

}

/*		³¬Ê±£¬15·Ö
import java.io.*;
public class pat1049 {
 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		double[] arr = new double[N];
		String[] str = input.readLine().split(" ");
		for(int i=0;i<N;i++) arr[i] = Double.parseDouble(str[i]);
		double sum = 0.0;
		for(int i=0;i<N;i++) sum += arr[i]*(i+1)*(N-i);
		System.out.printf("%.02f",sum);
	}
 
}
*/