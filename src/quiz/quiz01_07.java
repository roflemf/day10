package quiz;

import java.util.Scanner;

class reverse{
	public int input_() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int a = input.nextInt();
		return a;
	}
	
	public String cal_(int aaa) {
		String str="";
		/*
		str = str + bbb%10; //1234 -> 나머지 4를 str에 추가 (str : "4")
		bbb = bbb/10; // 123
		str = str + bbb%10; //123 -> 나머지3을 str에 추가 (str : "43") 
		bbb = bbb/10; // 12
		str = str + bbb%10; //12 -> 나머지2를 str에 추가 (str : "432")
		bbb = bbb/10; // 1
		str = str + bbb%10; //1 -> 나머지1을 str에 추가 (str : "4321")
		bbb = bbb/10; // 0
		
		//bbb = 0이되면 반복문을 빠져나간다.	*/
		
		while(aaa>0) {
			str = str + (aaa%10);
			aaa = aaa/10;
		}
		
		return str;
	}
	public void printReverse(String str) {
		System.out.println(str);
	}
	
}

public class quiz01_07 {
	
	public static void main(String[] args) {
		reverse t = new reverse();
		
		int aa = t.input_();
		
		String rev = t.cal_(aa);
		
		t.printReverse(rev);
		
	}

}
