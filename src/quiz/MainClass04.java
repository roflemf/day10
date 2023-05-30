package quiz;

import java.util.HashMap;
import java.util.Scanner;

class Quiz04{
	public HashMap<String, String> op(HashMap<String, String> m) {
		
		int n1 = Integer.parseInt(m.get("n1"));
		int n2 = Integer.parseInt(m.get("n2"));
		m.put("sum", n1 + n2 + "");
		return m;

		
	}
	public void pr(HashMap<String, String> m) {
		System.out.println(m.get("n1")+"+"+m.get("n2")+"="+m.get("sum"));
		
	}
	public HashMap<String, String> in() {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		System.out.println("수 입력  : ");
		int num =  input.nextInt();
		
		map.put("n1", num + "");
		map.put("n2", input.next()); //문자열로 받겟다
		return map; 
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Quiz04 q= new Quiz04();
		HashMap<String, String> m = q.in();
		m = q.op( m );
		q.pr(m);
		
		
		
	}
}
