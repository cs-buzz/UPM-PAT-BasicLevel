import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PAT_1056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int []num=new int[n];
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
		}
		int sum=0;

        Set<Integer> set = new HashSet<>();
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j) { 
					int a=num[i]*10+num[j];	
					set.add(a);
				}
			}
		}
		Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            sum += iter.next();
        }
		System.out.println(sum);
	}

}