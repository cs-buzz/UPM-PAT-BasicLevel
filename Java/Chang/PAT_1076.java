import java.util.Scanner;

public class PAT_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		int n=input.nextInt();
		input.nextLine();
		
		for(int i=0;i<n;i++) {
			String str=input.nextLine();
			int index = str.indexOf("T");
			char id = str.charAt(index-2);
			if (id == 'A') System.out.print(1);
			if (id == 'B') System.out.print(2);
			if (id == 'C') System.out.print(3);
			if (id == 'D') System.out.print(4);
		}
	}
}