package PATYiJi;
import java.io.*;

public class pat10752 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		st.nextToken();
		int tempAddress = (int)st.nval;
		st.nextToken();
		int N = (int)st.nval;
		st.nextToken();
		int K = (int)st.nval;
		
		int[] Data = new int[100000];
		int[] Next = new int[100000];
		for(int i=0;i<N;i++) {
			st.nextToken();
			int address = (int)st.nval;
			st.nextToken();
			int data = (int)st.nval;
			st.nextToken();
			int next = (int)st.nval;
			Data[address] = data;				//节省时间，用两个数组来共同记录数据
			Next[address] = next;
		}
		
		int[] Rank = new int[N];				//记录原始排序
		for(int i=0;i<N;i++) {
			Rank[i] = tempAddress;				//排好 Address
			tempAddress = Next[tempAddress];	//然后换上 nextAddress
		}
		
		int[] NewRank = new int[N];				//新的数组
		int loc = 0;							//记录插入NewRank的位置
		for(int i=0;i<N;i++) if(Data[Rank[i]]<0) {
			NewRank[loc] = Rank[i];				//给data小于0的排序
			loc++;
		}
		for(int i=0;i<N;i++) if(Data[Rank[i]]<K && Data[Rank[i]]>=0) {
			NewRank[loc] = Rank[i];				//给data小于K的排序
			loc++;
		}
		for(int i=0;i<N;i++) if(Data[Rank[i]]==K) {
			NewRank[loc] = Rank[i];				//给data等于K的排序
			loc++;
			break;
		}
		for(int i=0;i<N;i++) if(Data[Rank[i]]>K) {
			NewRank[loc] = Rank[i];				//给data大于K的排序
			loc++;
		}
		
		System.out.printf("%05d %d ", NewRank[0], Data[NewRank[0]]);
		for(int i=1;i<N;i++) {
			System.out.printf("%05d\n", NewRank[i]);
			System.out.printf("%05d %d ", NewRank[i], Data[NewRank[i]]);
		}System.out.println("-1");
	}

}

