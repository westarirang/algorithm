class Solution {
    public int solution(int[] array) {
		int[] count = new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count[i]++;
				}
			}
		}

		int modeIndex = 0;
		int modeCount = count[0];

		for(int k=1;k<count.length;k++) {
			if(count[modeIndex]<count[k]) {
				modeIndex = k;
				modeCount = count[k];
			}
		}
		
		int answer = array[modeIndex];
				
		for(int m=0;m<count.length;m++) {
			if(modeCount==count[m]&&array[modeIndex]!=array[m]) {
				return -1;
			}
		}

		return answer;
    }
}