import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine()); // 분수 번호 입력받기
		int cnt = 0; // 개수
		int line = 0; // 행 번호
		
		while(cnt < x) {
			line++;
			cnt = line * (line+1) /2;
		}
		
		if(line%2 != 0) {
			System.out.print((1+cnt-x) + "/" + (line+x-cnt));
		} else {
			System.out.print((line+x-cnt) + "/" + (1+cnt-x));
		}
		   
    }
}