class Solution {
    public int solution(int[] nums) {
    	int answer = 0;
    	
    	int[] prime = isPrime();
        	
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			for(int k=j+1;k<nums.length;k++) {
    				if(prime[nums[i]+nums[j]+nums[k]]==0) {
    					answer++;
    				}
    			}
    		}
    	}
    	
    	
        return answer;
    } 
    
   public static int[] isPrime() {
   	int[] prime = new int[3001];
   	for(int i=1; i < 3001; i++) {
		for(int j=2; j<=(int)Math.sqrt(i); j++) {
			if(i%j==0) {
				prime[i] = 1;
				break;
			}
		}
	}  
	   return prime;
   }
}