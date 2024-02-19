class Solution {
    public int solution(String[] strArr) {
		int answer = 0;
		int [] lengthArr = new int[31];
        
		for(String s:strArr) {
			lengthArr[s.length()] += 1;
		}
        
		for(int n:lengthArr) {
			if(answer<n) {
				answer = n;
			}
		}
		
		return answer;
    }
}