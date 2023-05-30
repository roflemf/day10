package quiz;

import java.util.Scanner;

class absolute{
	
	public int in_put(){

		Scanner input = new Scanner(System.in);
		System.out.println("수 입력  : ");
		int a=input.nextInt();
		return a;
		
	}
	//접근제한자(public, private)
	public void cal_abs(int aaa){
		
		if(aaa <0) {
			
			System.out.println(aaa*=(-1));
			
		}else {
			System.out.println(aaa);
		}
		
		
	}
	
	
	
}
public class quiz01_06 {
	public static void main(String[] args) {
		absolute t = new absolute();
		
		int aa = t.in_put();
		
		t.cal_abs(aa);
			
		
		
	}
}
