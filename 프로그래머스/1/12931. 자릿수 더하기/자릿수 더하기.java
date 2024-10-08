import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
		
		String str = Integer.toString(n);
		int tmp;

		for(int i=0; i<str.length(); i++){
			tmp = Integer.parseInt(String.valueOf(str.charAt(i)));
			answer += tmp;
		}

			return answer;
    }
}