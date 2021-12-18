package PATYiJi;
import java.io.*;

public class pat1054 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] str = input.readLine().trim().split(" ");
		int total = 0;
		double sum = 0.0;
		for(int i=0;i<N;i++) {
			try {
				double num = Double.parseDouble(str[i]);
				double temp = Double.parseDouble(String.format("%.2f", num));
				if(num>1000 || num<-1000 || Math.abs(temp-num)>=0.001) {
                    throw new NumberFormatException();
                }
				total++;
				sum += num;
			}catch(NumberFormatException ex) {
				System.out.println("ERROR: " + str[i] + " is not a legal number");
			}
		}
		
		if(total == 0) System.out.print("The average of 0 numbers is Undefined");
        else if(total == 1) System.out.printf("The average of 1 number is %.2f",sum);
        else System.out.printf("The average of %d numbers is %.2f", total, sum / total);
		System.out.println();
	}

}
