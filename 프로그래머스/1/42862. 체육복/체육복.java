import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		ArrayList<Integer> reserveList = new ArrayList<>();
		ArrayList<Integer> lostList = new ArrayList<>();
		
		for(int i:lost) {
			lostList.add(i);
		}

		for (int i = 0; i < reserve.length; i++) {
			reserveList.add(reserve[i]);
			for (int j = 0; j < lost.length; j++) {
				if (lost[j] == reserve[i]) {
					reserveList.remove(reserveList.indexOf(lost[j]));
					lostList.remove(lostList.indexOf(lost[j]));
				}
			}
		}

		int lostCnt = lostList.size();

		for (int i = 0; i < lostList.size(); i++) {
			for (int j = 0; j < reserveList.size(); j++) {
				if (lostList.get(i) == reserveList.get(j) - 1 || lostList.get(i) == reserveList.get(j) + 1) {
					reserveList.remove(j);
					lostCnt--;
					break;
				}
			}
		}

		answer = n - lostCnt;
		return answer;
    }
}