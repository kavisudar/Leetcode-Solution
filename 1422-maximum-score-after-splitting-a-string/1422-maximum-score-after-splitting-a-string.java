class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        
        for (int i = 1; i < s.length(); i++) {
            int score = countZeros(s.substring(0, i)) + countOnes(s.substring(i));
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
    
    private int countZeros(String str) {
        int zeroCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                zeroCount++;
            }
        }
        return zeroCount;
    }
    
    private int countOnes(String str) {
        int oneCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }
}
