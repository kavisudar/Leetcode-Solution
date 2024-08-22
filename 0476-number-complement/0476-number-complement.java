class Solution {
    public int findComplement(int num) {
        int n=num;
        if (n == 0) return 1;
        int bitLength = Integer.toBinaryString(n).length();  
        int m = (1 << bitLength) - 1;
        return n ^ m;
    }
}