class Solution {
    public int solution(int[][] lines) {
		int answer = 0;		
		
		int min = Math.min(lines[0][0], lines[1][0]);
		min = Math.min(min, lines[2][0]);
		
		int max = Math.max(lines[0][1], lines[1][1]);
		max = Math.max(max, lines[2][1]);
		
		
		for (int i = min; i <= max; i++) {
			int cnt = 0;
			if (lines[0][0] <= i && i < lines[0][1]) {
				cnt++;
			}
			if (lines[1][0] <= i && i < lines[1][1]) {
				cnt++;
			}
			if (lines[2][0] <= i && i < lines[2][1]) {
				cnt++;
			}

			if (cnt > 1) {
				answer++;
			}
		}

		return answer;
    }
}