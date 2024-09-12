import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
		
		for (String phone_number : phone_book){
			map.put(phone_number, 1);
		}
		
		for (String phone_number : phone_book) {
			for (int j = 1; j < phone_number.length(); j++){
				String prefix = phone_number.substring(0, j);
				if(map.containsKey(prefix)) return false;
			}
		}
		return true;
    }
}