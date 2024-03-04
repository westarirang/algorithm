import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(i -> ((i % divisor) == 0)).sorted().toArray();

		if (answer.length == 0) {
			int[] zero = { -1 };
			return zero;
		} else {
			return answer;
		}
    }
}