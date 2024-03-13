class Solution {
    public int[] solution(long n) {
    	String [] numList = (n+"").split("");
        int[] answer = new int[numList.length];
        for(int i=0; i<numList.length; i++) {
        	answer[i] = Integer.parseInt(numList[numList.length-1-i]);
        }
        return answer;
    }
}