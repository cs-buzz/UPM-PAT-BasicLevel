package PATYiJi;
import java.io.*;
import java.util.Arrays;
public class pat10502 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[] arr = new int[N];
		String[] str = input.readLine().trim().split(" ");
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(str[i]);
		Arrays.sort(arr);			//排序数据
		
		int m=0, n=0, min=10001;	//计算m和n
		for(int i=1;i<=Math.sqrt(N);i++) {
			if(N%i==0) {
				int temp = N/i;
				if(min > temp-i) {		//比较差值
					min = temp-i;		//储存差值
					m = temp;
					n = i;				//得到 m 和 n
				}
			}
		}
		int[][] output = new int[m][n];		//创建二维数组
		int locM=0, locN=-1;					//用来记录数据应该储存的位置		我们最先往右走，第一个位置是output[0][0] 所以起始位置是output[0][-1]
		int path = 1;			//因为路径应该是 右 → 下 → 左 → 上   所以我们用 path 来记录 1.右 2.下 3.左 4.上
		for(int i=N-1;i>=0;i--) {
			if(path==1 && (locN+1==n || output[locM][locN+1]!=0)) path++;		//右转下
			if(path==2 && (locM+1==m || output[locM+1][locN]!=0)) path++;		//下转左
			if(path==3 && (locN-1==-1 || output[locM][locN-1]!=0)) path++;		//左转上
			if(path==4 && (locM-1==-1 || output[locM-1][locN]!=0)) path=1;		//上转右
			
			switch(path) {			//控制输出位置移动
			case 1:
				locN++;
				break;
			case 2:
				locM++;
				break;
			case 3:
				locN--;
				break;
			case 4:
				locM--;
				break;
			}
			output[locM][locN] = arr[i];			//储存
		}
		for (int i=0;i<m;i++) {
            for (int j=0;j<n-1;j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println(output[i][n - 1]);
        }
	}

}
