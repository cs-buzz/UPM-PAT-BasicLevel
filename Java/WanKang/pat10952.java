package PATYiJi;
import java.io.*;
import java.util.*;

public class pat10952{
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr [] = br.readLine().split(" ");
        int a = Integer.valueOf(arr[0]);
        int b = Integer.parseInt(arr[1]);
        Student1095 [] info = new Student1095[a];
        for (int i = 0; i < a; i++) {
            info[i] = new Student1095(br.readLine());
        }
        Did1095 [] op = new Did1095[b];
        for (int i = 0; i < b; i++) {
            op[i] = new Did1095(br.readLine());
        }
        Arrays.sort(info);								//成绩降序，准考证升序排序
        for (int i = 0; i < b; i++){
            if(op[i].number==1){						//判断等级
                int temp = 0;
                System.out.println("Case " + (i + 1) + ": " + op[i].number + " " + op[i].did);
                for (int j = 0; j < a; j++) {
                    if(info[j].level.equals(op[i].did)){
                        if(temp==0){ temp++; }
                        System.out.println(info[j].toString()+" "+info[j].score);
                    }
                }
                if(temp==0) System.out.println("NA");
            }else if(op[i].number==2){					//考场编号
                int people = 0;
                int sum = 0;
                int temp = 0;
                System.out.println("Case "+(i+1)+": "+op[i].number+" "+op[i].did);
                for (int j = 0; j < a; j++) {
                    if (info[j].num1.equals(op[i].did)){
                        sum += info[j].score;
                        people++;
                        temp++;
                    }
                }
                if(temp==0) System.out.println("NA");
                else System.out.printf("%d %d\n", people, sum);
            }else if(op[i].number==3){
                List<Compare> list1 = new ArrayList<>();
                System.out.println("Case "+(i+1)+": "+op[i].number+" "+op[i].did);
                for (int j = 0; j < a; j++) {
                    String number1 = info[j].num1;
                    if(op[i].did.equals(info[j].date)){
                        boolean ok = false;
                        if(list1.size()!=0){
                            for (int k = 0; k < list1.size(); k++) {			//找list中重复的值
                                if (list1.get(k).number1.equals(number1)) {
                                    ok = true;
                                    list1.get(k).sum++;							//sum++
                                    break;
                                }
                            }
                        }
                        if(!ok) list1.add(new Compare(info[j].num1, 1));
                    }
                }
                if(list1.size() == 0) System.out.println("NA");			//list为空
                else{
                    Collections.sort(list1);							//人数降序，考场号升序
                    for(Compare com: list1) System.out.println(com);
                }
            }
        }
    }
}
class Student1095 implements Comparable<Student1095>{
	
    public int score;										//成绩
    public String level;									//等级
    public String num1;										//考场编号
    public String date;										//日期
    public String num2;										//考生编号
    
    public Student1095(String string){						//只输入一个 String 然后分开
        this.level = string.substring(0,1);
        this.num1 = string.substring(1,4);
        this.date = string.substring(4,10);
        this.num2 = string.substring(10,13);
        this.score = Integer.parseInt(string.substring(14));
    }
    
    public int compareTo(Student1095 info){					//成绩降序,准考证升序
        if(this.score>info.score) return -1;
        else if(this.score<info.score) return 1;
        else return this.toString().compareTo(info.toString());
    }

    @Override
    public String toString() {
        return this.level+this.num1+this.date+this.num2;
    }
}

class Did1095{
	
    public int number;
    public String did;
    
    Did1095(String string){
        String []s = string.split(" ");
        this.number = Integer.valueOf(s[0]);
        this.did = s[1];
    }
}

class Compare implements Comparable<Compare>{
	
    public String number1;
    public int sum;

    public Compare(String number1, int sum) {
        this.number1 = number1;
        this.sum = sum;
    }

    @Override
    public int compareTo( Compare o) {						//人数降序，考场升序
        if(this.sum > o.sum) return -1;
        else if(this.sum < o.sum) return 1;
        else return this.number1.compareTo(o.number1);
    }

    @Override
    public String toString() {
        return this.number1+" "+this.sum;
    }
}

