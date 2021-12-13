import java.util.Scanner;

public class PAT_1043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char[] a=input.next().toCharArray();
		char[] b= {'P','A','T','e','s','t'};
		int P=0,A=0,T=0,e=0,s=0,t=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='P') 
				P++;
			if(a[i]=='A') 
				A++;
			if(a[i]=='T') 
				T++;
			if(a[i]=='e') 
				e++;
			if(a[i]=='s') 
				s++;
			if(a[i]=='t') 
				t++;
		}
		int total=P+A+T+e+s+t;
		while(total>0) {
			if(P>0)
				System.out.print("P");
				P--;
			if(A>0)
				System.out.print("A");
				A--;
			if(T>0)
				System.out.print("T");
				T--;
			if(e>0)
				System.out.print("e");
				e--;
			if(s>0)
				System.out.print("s");
				s--;
			if(t>0)
				System.out.print("t");
				t--;
			total--;
		}
	}
}
