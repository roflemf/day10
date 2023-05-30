package quiz;

import java.util.Scanner;

class test {
	int[] inputNumber() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번쨰 수 입력 : ");
		int a = input.nextInt();
		
		System.out.println("두번쨰 수 입력 : ");
		int b = input.nextInt(); //입력 담당
		
		int[] arr = {a, b};
		
		return arr;
	}
	String calNumber(int[] arr) {
		if(arr[0]>arr[1]) { //계산담당(연산)
			return "첫번째가 더 큽니다.";
		}else {
			return "두번째가 더 큽니다.";
		}
	}
	void printNumber(String sss) {
		System.out.println(sss);
	}
}

public class quiz01_1 {
	public static void main(String[] args) {
		test t = new test();
		
		int[] arr1 = t.inputNumber();//숫자를 입력받아서 두 숫자를 배열형으로 리턴받아옴
	
				
		String str = t.calNumber(arr1);//입력(배열) => 리턴(스트링)
										//String str = t.calNumber(arr1);//배열형의 두 숫자를 누가 더 큰지 비교해서 스트링형으로 비교결과를 리턴받아옴
		
		t.printNumber(str); // 출력
	}
}
