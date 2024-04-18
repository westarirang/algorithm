class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int digit = x;
        
        while(digit>0) {
        	sum += digit%10;
        	digit /= 10;
        }
        
        return x%sum==0? true: false;
    }
}