import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(char i='a'; i<='z'; i++) {
			System.out.print(str.indexOf(i)+" ");
			
		}
		sc.close();
	}
}
