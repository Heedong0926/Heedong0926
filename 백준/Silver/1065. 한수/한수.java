import java.util.Scanner;

public class Main{
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(hansu(sc.nextInt()));
		
		sc.close();
		
	}
	
	public static int hansu(int num) {
		int cnt = 0;
		
		if(num<100) {
			
			return num;
			
		}else {
			
			cnt = 99;
			
			for(int i=100; i<=num; i++) {
				
				int a = i/100;
				int b = (i/10)%10;
				int c = i%10;
				
				if((a-b)==(b-c)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
}