class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
        while(x>0){
            rev=x%10+rev*10;
            x/=10;
        }
        return (original==rev)?true:false;
    }
}