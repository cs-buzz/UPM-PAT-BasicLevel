package PATYiJi;
import java.io.*;

public class pat1044 {
	
	public static String[] number = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	public static String[] uppernum = {"tret", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] arr = new String[N];
		for(int i=0;i<N;i++) arr[i] = input.readLine();
		input.close();
		for(int i=0;i<N;i++) {
			char chara = arr[i].charAt(0);		//通过判断第一个char是不是数字，来判断是 地转火，还是火转地
			if(chara>47 && chara<58) toMars(arr[i]);
			else toEarth(arr[i]);
		}
	}
	
	public static void toMars(String str) {
		int num = Integer.parseInt(str);
		if(num==0) System.out.print(number[0]);	//如果数字是0，只输出 tret
		else {
			int a = num/13;		//十位数
			int b = num%13;		//个位数
			if(a==0) System.out.print(number[b]);	//如果没有十位数，就只输出个位数
			else {
				System.out.print(uppernum[a]);
				if(b!=0) System.out.print(" " + number[b]); //输出个位数和空格
			}
		}
		System.out.println();
	}
	
	public static void toEarth(String str) {
		String[] arr = str.split(" ");
		int num = 0;
		if(arr.length == 1) {		//如果只有一位数
			if(find(number, arr[0]) > -1) num = find(number, arr[0]);	//如果第一个值是number 而不是uppernum
			else num = find(uppernum, arr[0]) * 13;  //输出13
		}else num = find(uppernum, arr[0]) * 13 + find(number, arr[1]);		//输出两位数
		System.out.println(num);
	}
	
	public static int find(String[] arr, String num) {
		for(int i=0;i<arr.length;i++) {
			if(num.equals(arr[i])) {
				return i;
			}
		}
		return -1;		//没有的话返回一个越界值，也就是数组没有的位置
	}

}
