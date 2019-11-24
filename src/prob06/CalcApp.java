package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.println(">>");
			String exp = scanner.nextLine();
			String[] tokens = exp.split(" ");
		
			if(exp.equals("quit")) {
				System.out.println("Stop");
				break;
			}
			
			System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2]);
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			int result = 0;			
			
			if(tokens[1].equals("+")) {
				Add add = new Add();
				add.setValue(a , b);
				result = a + b;
				System.out.println(">>" + result);
				
			} else if(tokens[1].equals("-")) {
				Sub sub = new Sub();
				sub.setValue(a , b);
				result = a - b;
				System.out.println(">>" + result);
				
			} else if(tokens[1].equals("*")) {
				Mul mul = new Mul();
				mul.setValue(a , b);
				result = a*b;
				System.out.println(">>" + result);
				
			} else if(tokens[1].equals("/")) {
				Div div = new Div();
				div.setValue(a , b);
				result = a/b;
				System.out.println(">>" + result);
				
			} else {
				System.out.println("사칙연산만 가능합니다.");
			}
		}
		
		scanner.close();

	}

}
