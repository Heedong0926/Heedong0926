import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		int[] cnt = new int[8001];
		int max = 0;
		int mode = 0;
		
		for(int i=0; i<arr.length; i++) {
			cnt[arr[i]+4000]++;
			max = Math.max(cnt[arr[i]+4000], max);
		}
		
		ArrayList<Integer>max_idx = new ArrayList<> ();
		
		for(int i=0; i<=8000; i++) {
			if(max == cnt[i]) {
				max_idx.add(i-4000);
			}
		}
		
		if(max_idx.size()>1) {
			mode = max_idx.get(1);
		} else {
			mode = max_idx.get(0);
		}
		
		System.out.println((int)Math.round(sum/(arr.length))); // 1. 산술평균
		System.out.println(arr[arr.length/2]); // 2. 중앙값
		System.out.println(mode); // 3. 최빈값
		System.out.println(arr[arr.length-1]-arr[0]); // 4. 범위
		
		br.close();
	}
   }
