class Solution {
    public int solution(String myString, String pat) {
		int answer = 0;
		String[] ms = myString.split("");

		for(int i=0; i <= ms.length-pat.length();i++) {
			String str = ms[i];
			for(int j=1; j<pat.length(); j++) {
				str += ms[i+j];
			}
			if(str.equals(pat)) {
				answer++;
			}
		}

		return answer;
    }
}