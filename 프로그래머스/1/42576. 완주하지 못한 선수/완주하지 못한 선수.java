import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
            // 기존에 있는 선수면 1, 없는 선수면 기본값 0
            // 동명이인인 경우 2가 됨
        }
        
        for(String player : completion){
            map.put(player, map.get(player) - 1);
            // 기존 배열 내에 무조건 있긴 있으므로 1 - 1 이 되어 같은 이름일 경우 0이 됨
        }
        
        Iterator<Map.Entry<String, Integer>> ite = map.entrySet().iterator();
        
        while(ite.hasNext()) {
            Map.Entry<String, Integer> entry = ite.next();
            if (entry.getValue() != 0){
                // 0이 아닌 사람 = 완주하지 못한 사람
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}