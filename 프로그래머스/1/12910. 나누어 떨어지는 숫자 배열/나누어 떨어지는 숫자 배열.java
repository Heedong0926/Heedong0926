import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			if(num % divisor == 0){
				set.add(num);
			}
		}

		Iterator<Integer> iter = set.iterator();

		if(!set.isEmpty()){
			answer = new int[set.size()];
			for(int i=0; i<set.size(); i++){
				answer[i] = iter.next();
			}
		}else{
			answer = new int[1];
			answer[0] = -1;
		}
        
        Arrays.sort(answer);

		return answer;
    }
}