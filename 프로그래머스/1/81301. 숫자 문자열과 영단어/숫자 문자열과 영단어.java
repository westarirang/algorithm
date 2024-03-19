class Solution {
    public int solution(String s) {
        String[] numEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<numEng.length;i++) {
        	s = s.replaceAll(numEng[i], i+"");
        }
        return Integer.parseInt(s);
    }
}