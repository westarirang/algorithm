class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = num%2==0? (num/2)-1: num/2;
        answer[mid] = total/num;
        
        for(int i=mid-1; i>=0;i--) {
        	answer[i] = answer[i+1] - 1;
        }
        
        for(int i=mid; i<num-1; i++) {
        	answer[i+1] = answer[i] + 1;
        }
        
        return answer;
    }
}