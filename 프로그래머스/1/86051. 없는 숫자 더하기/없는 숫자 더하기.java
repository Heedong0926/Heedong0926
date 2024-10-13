class Solution {
    public int solution(int[] numbers) {
        int numbersTotal = 0;
		int total = 0;

		for (int i=0; i<10; i++){
			total += i;
		}

		for (int number : numbers) {
			numbersTotal += number;
		}
		
		return total - numbersTotal;
    }
}