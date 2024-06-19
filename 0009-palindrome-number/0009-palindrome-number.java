class Solution {
    public boolean isPalindrome(int x) {
        int result=0;
        int rem=0;
        int y=x;
        while(x>0){
            rem=x%10;
            result=(result*10)+rem;
            x=x/10;
        }
        if(result==y){
            return true;
        }
        else
            return false;
    }
}