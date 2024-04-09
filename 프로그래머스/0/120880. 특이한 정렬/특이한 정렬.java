import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = Arrays.stream(numlist).map(i-> i-n).toArray();
        
        for(int i=0;i<answer.length-1;i++) {
        	for(int j=i+1;j<answer.length;j++) {
            	int temp = answer[i];
            	if(Math.abs(answer[i])>Math.abs(answer[j])) {
                	answer[i] = answer[j];
                	answer[j] = temp;
            	}else if(Math.abs(answer[i])==Math.abs(answer[j])) {
            		if(answer[i] < answer[j]) {
            			answer[i] = answer[j];
                    	answer[j] = temp;
            		}
            	}
        	}       	
        }
        
        answer = Arrays.stream(answer).map(i-> i+n).toArray();
        return answer;
    }
}