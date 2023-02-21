import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); // 입력받을 점의 개수
		
		int[][] arr = new int[num][2]; // 열의 크기가 2인 2차원 배열 생성
		
		StringTokenizer st; // 띄어쓰기 반영을 위한 StringTokenizer 선언
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		} // 입력받기
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		}); 
		// e1(1, 1)이고 e2(1, -1)이라고 했을 때 e1[0]=1과 e2[0]=1로 같다.
		// 따라서 e1[1]=1과 e2[1]=-1을 비교한다. => return e1[1] - e2[1]; => 2로 양수이므로 두 원소의 위치를 교환한다.
		
		// e1(2, 2)이고 e2(3, 3)이라고 했을 때 e1[0]=2과 e2[0]=3으로 같지 않다.
		// => return e1[0] - e2[0]; => -1로 음수이므로 두 원소의 위치를 교환하지 않는다.
		
		StringBuilder sb = new StringBuilder();
		// StrinfBuilder는 기존의 데이터에 더하는 방식으로 속도가 빠르고, 상대적으로 부하가 적다.
				
		for(int i=0; i<num; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
		
	}
   }
