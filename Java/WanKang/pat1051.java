package PATYiJi;
import java.io.*;

public class pat1051 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = input.readLine().trim().split(" ");
		double R1 = Double.parseDouble(arr[0]);
	    double P1 = Double.parseDouble(arr[1]);
	    double R2 = Double.parseDouble(arr[2]);
	    double P2 = Double.parseDouble(arr[3]);
	    
	    double A = R1*R2*Math.cos((P1+P2));
	    double B = R1*R2*Math.sin(P1+P2);
	    
	    if (Math.abs(A) <= 0.001) System.out.print("0.00");
	    else System.out.printf("%.2f", A);
	    if (B > 0) System.out.printf("+%.2fi", B);
	    else if (Math.abs(B) <= 0.001) System.out.print("+0.00i");
	    else System.out.printf("%.2fi", B);
	    System.out.println();
	}

}
