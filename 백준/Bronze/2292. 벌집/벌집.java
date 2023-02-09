import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine()); // 숫자 입력받기
    	int count = 1; // 방의 개수(최소 1)
    	int range = 2; // 2~7, 8~19, 20~37, 38~61
    	
    	if(N == 1) { // 입력받은 숫자가 1이면 방의 개수는 1로 출력
    		System.out.println(1);
    	}else {
    		while(range <= N) { // 범위가 입력받은 숫자 N보다 작거나 같을 동안 실행
    			range = range + (6*count);
    			// 2, 8(2+6*1), 20(2+8+6*2), 38(2+8+20+6*3), 61(2+8+20+38+6*4)...
    			count++; // 거쳐가는 방의 개수 +1
    		}
    		System.out.println(count);
    	}
    	
        
    }
}