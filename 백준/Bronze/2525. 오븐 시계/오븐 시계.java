import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cook = sc.nextInt();
		
		int hTime = (h*60 + m + cook)/60;
		int mTime = (h*60 + m + cook)%60;
		
		if(hTime<24) {
			System.out.println(hTime+" "+mTime);
		}else if(hTime==24) {
			hTime = 0;
			System.out.println(hTime+" "+mTime);
		}else if(hTime>24) {
			hTime-=24;
			System.out.println(hTime+" "+mTime);
		}
		
			
		sc.close();

	}
}
