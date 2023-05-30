package quiz;

import java.util.Scanner;

class quiztest1{
	
int inputNum() {
	Scanner input = new Scanner(System.in);
	System.out.println("숫자 입력 : ");
	int a = input.nextInt();
	return a;
}
void calNum(int a){
		if(a%2 == 0) {
			System.out.println(a+"는 짝수이다");
		}else {
			System.out.println(a+"는 홀수이다");
		}
	}
}

public class quiz01_03 {
	public static void main(String[] args) {
	//메인에서 입력받고 입력받은 수를 메소드(기능)를 만들어 메소드에서 계산 후 출력
		quiztest1 t = new quiztest1();
		
		int a = t.inputNum();
		
		t.calNum(a); //계산 및 출력
		
		///////////////////////////////////
		
	}

}
