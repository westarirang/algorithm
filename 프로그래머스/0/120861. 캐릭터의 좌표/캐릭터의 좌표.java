class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String str:keyinput) {
            switch(str) {
                case "left":
                    answer[0] = answer[0]!=-board[0]/2? answer[0] -= 1: -board[0]/2; 
                    break;
                case "right": 
                    answer[0] = answer[0]!=board[0]/2? answer[0] += 1: board[0]/2; 
                    break;
                case "up":
                    answer[1] = answer[1]!=board[1]/2? answer[1] += 1: board[1]/2; 
                    break;
                case "down":
                    answer[1] = answer[1]!=-board[1]/2? answer[1] -= 1: -board[1]/2; 
                    break;
            }
        }
        
        return answer;
    }
}