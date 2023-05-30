package quiz;

import java.util.Scanner;

class Quiz01{
	
	public String inputName() {
		Scanner input = new Scanner(System.in);
		String name = null;
		
		System.out.println("이름 입력");
		name = input.next();
		return name;
	}
	
	public void print(String name) {
		
		
		System.out.println("당신 이름 : " + name);		
	}
	
}

public class MainClass01 {
	
	public static void main(String[] args) {
		Quiz01 quiz = new Quiz01();
		String n = quiz.inputName();
		quiz.print( n );
		
		
	}

}
