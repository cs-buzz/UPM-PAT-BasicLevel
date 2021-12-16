package PATYiJi;
import java.io.*;

public class pat1034 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] str = input.readLine().trim().split(" |/");
		long[] num = new long[4];
		num[0] = Long.parseLong(str[0]);
		num[1] = Long.parseLong(str[1]);
		num[2] = Long.parseLong(str[2]);
		num[3] = Long.parseLong(str[3]);
		
		String num1 = calcu(num[0],num[1]);
		String num2 = calcu(num[2],num[3]);
		
		PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out));
		output.print(num1 + " + " + num2 + " = " + calcu(num[0]*num[3]+num[2]*num[1],num[1]*num[3]) + "\n");    
		output.flush();
		output.print(num1 + " - " + num2 + " = " + calcu(num[0]*num[3]-num[2]*num[1],num[1]*num[3]) + "\n");
		output.flush();
		output.print(num1 + " * " + num2 + " = " + calcu(num[0]*num[2],num[1]*num[3]) + "\n");
		output.flush();
		output.print(num1 + " / " + num2 + " = ");
		output.flush();
		if(num[2] < 0) output.print(calcu(num[0] * num[3] * num[2] / Math.abs(num[2]) , num[1] * Math.abs(num[2])) + "\n");
		else output.print(calcu(num[0] * num[3] , num[1] * num[2]) + "\n");
		output.flush();
		
	}
	
	private static long gys(long nun1,long num2) {	//找公约数
        return num2 == 0 ? nun1 : gys(num2 , nun1 % num2);
    }
	
	public static String calcu(Long num1,Long num2) {
		if(num2==0) return "Inf";
		long gys = gys(Math.abs(num1),num2); 	//找到公约数
		num1 = num1/gys;						//除去公约数
		num2 = num2/gys;
		long Zshu = Math.abs(num1) / num2;   		//找到整数
		long FenZi = Math.abs(num1) - Zshu * num2;	//找到分子
        if(Zshu == 0 && FenZi == 0) {
            return "0";
        }
        if(num1 < 0) {
            if(Zshu != 0 && FenZi != 0)
                return "(-"+Zshu+" "+FenZi+"/"+num2+")";
            if(Zshu != 0 && FenZi == 0)
                return "(-"+Zshu+")";
            if(Zshu == 0 && FenZi != 0)
                return "(-"+FenZi+"/"+num2+")";
        } else {
            if (Zshu != 0 && FenZi != 0)
                return Zshu+" "+FenZi+"/"+num2;
            if(Zshu != 0 && FenZi == 0)
                return String.valueOf(Zshu);
            if(Zshu == 0 && FenZi != 0)
                return FenZi+"/"+num2;            
        }
        return null;
	}
	
}
