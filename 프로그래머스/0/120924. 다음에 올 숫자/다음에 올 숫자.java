class Solution {
    public int solution(int[] common) {
		int comm1 = common[1] - common[0];
		int comm2 = common[2] - common[1];
		return comm1==comm2? common[common.length-1]+comm1: common[common.length-1]*(comm2/comm1);

    }
}