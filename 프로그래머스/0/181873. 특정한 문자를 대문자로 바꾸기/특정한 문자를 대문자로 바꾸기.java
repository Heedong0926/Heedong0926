class Solution {
    public String solution(String my_string, String alp) {
        char upperChar = Character.toUpperCase(alp.charAt(0));
        String answer = my_string.replace(alp,String.valueOf(upperChar));
        return answer;
    }
}