import java.util.Scanner;

public class PAT_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str[][]=new String[n][4];
		int count1=0,count2=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<4;j++) {
				str[i][j]=input.next();
			}
			if(Integer.parseInt(str[i][0])+Integer.parseInt(str[i][2])==Integer.parseInt(str[i][1])&&
					Integer.parseInt(str[i][0])+Integer.parseInt(str[i][2])!=Integer.parseInt(str[i][3])) {
				count2++;
			}else if(Integer.parseInt(str[i][0])+Integer.parseInt(str[i][2])==Integer.parseInt(str[i][3])&&
					Integer.parseInt(str[i][0])+Integer.parseInt(str[i][2])!=Integer.parseInt(str[i][1])) {
				count1++;
			}
		}
		System.out.println(count1+" "+count2);
	}
}
