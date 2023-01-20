import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(str.equals("F")) {
			System.out.println(0.0);
			return;
		}
		
		double sj = 0.0;
		sj += 69 - str.charAt(0);
		
		switch (str.charAt(1)) {
			case '+':
				sj += 0.3;
				break;
			case '-':
				sj -= 0.3;
				break;
		}
		
		System.out.println(sj);
		
		sc.close();
	}
}