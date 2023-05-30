package quiz;

import java.util.Scanner;

class tester{ //default(public과 유사하나 같은 패지키(폴더)에서만 접근가능)
	int input_Num(){
	
		//입력
				Scanner input = new Scanner(System.in);
				System.out.print("수 입력 : ");
				int a = input.nextInt();
				return a;
	}
	
	int cal_Num(int a) {
		int yes=0;
		for (int i = 1; i <= a; i++) {
			if(a % i == 0) yes++; // 1~입력받은수 (2개)
		}
		return yes;
		
	}	
	void printNum(int a) {
		if(a==2) System.out.println("소수"); //여기서 검증한 a는 cal_Num에서 리턴된 값
		else System.out.println("소수아님");
	}
}


public class quiz01_05 {
	
	public static void main(String[] args) {
		//소수 구하기
		tester t = new tester();
		
		int a = t.input_Num(); // 입력
		
		int b = t.cal_Num(a);
		
		t.printNum(b);
		
		
		
	}
	

}
