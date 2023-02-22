import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<num/4; i++) {
			System.out.print("long ");
		}
		
		System.out.println("int");	

	}
   }