class Solution {
    public String solution(String s) {
		String answer = "";
		String[] strList = s.split(" ", -1);
        
		for (int i = 0; i < strList.length; i++) {
			for (int j = 0; j < strList[i].length(); j++) {
				if (j % 2 == 0) {
					answer += strList[i].toUpperCase().charAt(j);
				} else {
					answer += strList[i].toLowerCase().charAt(j);
				}
			}
			
			if (i < strList.length - 1) {
				answer += " ";
			}
		}

		return answer;
    }
}