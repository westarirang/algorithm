import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] sum = new int[3];
        ArrayList<Integer> temp = new ArrayList<>();
        int max = 0;
        
        int[] math1 = {1,2,3,4,5};
        int[] math2 = {2,1,2,3,2,4,2,5};
        int[] math3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++) {
        	sum[0] += answers[i]==math1[i%5]? 1:0;
        	sum[1] += answers[i]==math2[i%8]? 1:0;
        	sum[2] += answers[i]==math3[i%10]? 1:0;
        }
        
        
        for(int i=0; i<3; i++) {
        	if(sum[i]>max) {
        		max=sum[i];
        	}
        }
        
        for(int i=0; i<3; i++) {
        	if(sum[i]==max) {
        		temp.add(i+1);
        	}
        }
        
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }
}