import java.util.Scanner;

public class PAT_1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine().toLowerCase();
		int[]times=new int[26];
		
		for(int i=0;i<str.length();i++) {
			char[]a=str.toCharArray();
			if(a[i]>='a' && a[i]<='z') {
				int j=a[i]-'a';
				times[j]++;
			}else if(a[i]>='A' && a[i]<='Z') {
				int j=a[i]-'A';
				times[j]++;
			}
		}
		int max=times[0],maxIndex=0;
		for(int i=0;i<times.length;i++) {
			if(times[i]>times[maxIndex]) {
				maxIndex=i;
				max=times[i];
			}
		}
		char maxChar=(char) ('a'+maxIndex);
		System.out.print(maxChar+" "+max);
	}
}