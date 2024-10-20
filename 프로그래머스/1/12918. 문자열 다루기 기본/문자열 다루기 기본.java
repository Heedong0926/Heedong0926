class Solution {
    public boolean solution(String s) {
		boolean answer = false;
		
		if((s.length() == 4 || s.length() == 6) && isNumberic(s)){
			answer = true;
		}
		
		return answer;
	}

	public static boolean isNumberic(String str) {
		return str.chars().allMatch(Character::isDigit);
	}
}