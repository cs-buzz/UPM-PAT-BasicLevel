package PATYiJi;
import java.io.*;

public class pat1037 {		//�����ʽ������

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] str = input.readLine().trim().split(" |\\.");  //"." ֮ǰ�����
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++) arr[i] = Integer.parseInt(str[i]);
		//int kunt, Sickle, Galleon;
		if(arr[5]<arr[2]) {
			arr[5] += 29;
			arr[4]--;
		}
		int Kunt = arr[5] - arr[2];
		if(arr[4]<arr[1]) {
			arr[4] += 17;
			arr[3]--;
		}
		int Sickle = arr[4] - arr[1];
		if(arr[3]>=arr[0]) System.out.println(arr[3]-arr[0] + "." + Sickle + "." + Kunt);
		else {			//�����Ǯ����
			int Galleon = arr[0] - arr[3];
			if(Kunt==0 && Sickle==0) {
				System.out.println("-" + Galleon + "." + Sickle + "." + Kunt);
				System.exit(0);
			}
			if(Kunt!=0) Sickle++;		//�����һλ������Ҫ��һλ
			Kunt = 29 - Kunt;
			Sickle = 17 - Sickle;
			Galleon--;
			System.out.println("-" + Galleon + "." + Sickle + "." + Kunt);
		}
		
	}

}
