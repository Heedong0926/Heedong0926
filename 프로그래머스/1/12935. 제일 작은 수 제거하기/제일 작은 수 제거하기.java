import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] tmp = arr.clone();
		
		if(arr.length == 1){
			return new int[]{-1};
		} else {
			Arrays.sort(tmp);
			
			int min = tmp[0];
			List<Integer> list = new ArrayList<>();
			
			for(int num : arr){
				if(min != num){
					list.add(num);
				}
			}
			
			int[] answer = new int[list.size()];

			for (int i = 0 ; i < list.size() ; i++)
				answer[i] = list.get(i);
			
			return answer;
		}
    }
}