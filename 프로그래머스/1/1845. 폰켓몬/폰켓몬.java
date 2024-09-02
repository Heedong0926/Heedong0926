import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        // 총 N 마리의 폰켓몬 중에서 N/2마리 선택 가능
        
        HashSet<Integer> set = new HashSet<>();
        // HashSet 이용해 중복 제거
        
        for(int num : nums){
            set.add(num);
        }
        
        return set.size() > answer ? answer : set.size();
        // [3, 1, 2, 3] 
        // nums.length/2 : 2 -> 최대 2개 선택 가능
        // set.size() : 3 -> [1, 2, 3]
        // => 2
        
        // [3, 3, 3, 2, 2, 2]
        // nums.length/2 : 3 -> 최대 3개 선택 가능
        // set.size() : 2 -> [2, 3]
        // => 2
    }
} 