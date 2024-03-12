class Solution {
    public int solution(int[][] board) {
		int answer = 0;
        
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					findDangerousArea(board, i, j);
				}
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					answer++;
				}
			}
		}
        
		return answer;
    }
    
    
	void findDangerousArea(int[][] board, int x, int y) {
		int[][] directions = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

		for (int[] direction : directions) {
			int newX = x + direction[0], newY = y + direction[1];
			if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[newX].length) {
                // 지뢰 매설 위험 지역 1 
                // 지뢰 인접 위험 지역 2
				board[newX][newY] = board[newX][newY] == 1 ? 1 : 2;
			}
		}
	}

}