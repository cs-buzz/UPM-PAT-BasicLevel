package PATYiJi;
import java.io.*;

public class pat10522 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String hand = input.readLine().trim();
		String[] hands = hand.substring(hand.indexOf("[") + 1, hand.lastIndexOf(']')).split("\\]\\s*\\[");
		String eye = input.readLine().trim();
		String[] eyes = eye.substring(eye.indexOf("[") + 1, eye.lastIndexOf(']')).split("\\]\\s*\\[");
		String mouth = input.readLine().trim();
		String[] mouths = mouth.substring(mouth.indexOf("[") + 1, mouth.lastIndexOf(']')).split("\\]\\s*\\[");
		int N = Integer.parseInt(input.readLine());
		
		int handnum = hands.length;
		int eyenum = eyes.length;
		int mouthnum = mouths.length;
		for(int i=0;i<N;i++) {
			String[] str = input.readLine().split(" ");
			int[] arr = new int[5];
			for(int j=0;j<5;j++) arr[j] = Integer.parseInt(str[j]);
			if(arr[0]>handnum || arr[1]>eyenum || arr[2]>mouthnum || arr[3]>eyenum || arr[4]>handnum) {
				System.out.println("Are you kidding me? @\\/@");
				continue;
			}
			System.out.print(hands[arr[0]-1]);
			System.out.print("(" + eyes[arr[1]-1]);
			System.out.print(mouths[arr[2]-1]);
			System.out.print(eyes[arr[3]-1] + ")");
			System.out.println(hands[arr[4]-1]);
		}
	}

}
