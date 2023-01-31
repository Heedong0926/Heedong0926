import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int j=0; j<num; j++) {
			String str = sc.next();
			char[] arr = new char[str.length()];
			int cnt = 0;
			int sum = 0;
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
				if(arr[i] == 'O') {
					cnt++;
					sum += cnt;
				}else {
					cnt = 0;
				}
				
			}
			System.out.println(sum);
		}
		
		sc.close();
		
	}
}
