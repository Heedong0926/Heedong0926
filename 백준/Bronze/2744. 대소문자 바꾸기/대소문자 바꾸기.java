import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String up = a.toUpperCase();
		String low = a.toLowerCase();
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == low.charAt(i)){
				System.out.print(String.valueOf(a.charAt(i)).toUpperCase());
			}else {
				System.out.print(String.valueOf(a.charAt(i)).toLowerCase());
			}
		}
	}
}
