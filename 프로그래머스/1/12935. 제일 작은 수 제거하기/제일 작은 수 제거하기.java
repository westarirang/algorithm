import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length;i++) {
        	if(min>arr[i]) {
        		min = arr[i]; 
        	}
        }
        
        final int minValue = min;
        int [] answer =  Arrays.stream(arr).filter(i-> i!=minValue).toArray();
        return answer.length!=0? answer:new int[]{-1};
    }
}