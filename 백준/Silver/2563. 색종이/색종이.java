import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int su = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[101][101];
		int total = 0;
		
		for(int i=0; i<su; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=a; j<a+10; j++) {
				for(int k=b; k<b+10; k++) {
					if(!arr[j][k]) {
						arr[j][k] = true;
						total++;
					}
				}
			}
		}
		System.out.println(total);
    }
}