import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if((M-45)<0) {
			if(H==0) {
				M = M + 15;
				H = 23;
				System.out.println(H + " " + M);
			}else {
				M = M + 15;
				System.out.println((H-1) + " " + M);
			}
		}else {
			System.out.println((H) + " " + (M-45));
		}
		sc.close();
	}
}