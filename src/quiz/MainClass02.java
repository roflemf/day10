package quiz;

import java.util.Scanner;

class Quiz02{
	public void inputName() {
		Scanner input = new Scanner(System.in);
		String[] names = new String[3];
		for(int i = 0; i <names.length; i++) {
			System.out.print(i + ".번째 이름 입력 : ");
			names[i] = input.next();
		}
		printName(names);
	}
	
	public void printName(String[] n) {
		System.out.println(" 출력 실행 ");
		for(int i = 0; i< n.length; i++) {
			System.out.println( n[i]);
		}
		System.out.println("==================");
		for(String name : n) {
			System.out.println( name );
		}
		
	}
	
}

public class MainClass02 {
	
	public static void main(String[] args) {
		
		Quiz02 q = new Quiz02();
		q.inputName();
		
		
	}

}
