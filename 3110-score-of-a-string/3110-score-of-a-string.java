class Solution {
    public int scoreOfString(String s) {
        char a[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs(a[i]-a[i+1]);
        }
        return sum;
    }
}