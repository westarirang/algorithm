class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        
        while(temp!=1&&answer<500) {
        	temp = temp%2==0? temp/2:temp*3+1;
        	answer++;
        }
                
        return answer==500?-1:answer;
    }
}