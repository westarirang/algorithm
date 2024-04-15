class Solution {
    public int solution(String[] babbling) {
		int answer = 0;
		
		for (String s : babbling) {
			String temp = s.replace("aya", "*");
			temp = temp.replace("ye", "*");
			temp = temp.replace("woo", "*");
			temp = temp.replace("ma", "*");
			temp = temp.replace("*", "");
			if (temp.length() == 0) {
				answer++;
			}
		}
        
		return answer;
    }
}