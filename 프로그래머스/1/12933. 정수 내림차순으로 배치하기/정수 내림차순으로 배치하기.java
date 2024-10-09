import java.util.*;
class Solution {
    public long solution(long n) {
        StringBuilder answer = new StringBuilder();
		String[] list = String.valueOf(n).split("");
		int[] list2 = new int[list.length];
		Arrays.sort(list);

		System.out.println(Arrays.toString(list));
		
		for(int i=list.length-1; i>=0; i--){
			list2[list.length-1-i] = Integer.parseInt(list[i]);
		}

		for (int j : list2) {
			answer.append(j);
		}
		
		return Long.parseLong(answer.toString());
    }
}