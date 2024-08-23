class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        int i;
        String str="";
        String str1="";
        for(i=0;i<n;i++){
            str=str+s.charAt(i);
        }
        for(i=n;i<s.length();i++){
            str1=str1+s.charAt(i);
        }
        int count=0,count1=0;
         for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' ||
                str.charAt(j) == 'o' || str.charAt(j) == 'u' || str.charAt(j) == 'A' ||
                str.charAt(j) == 'E' || str.charAt(j) == 'I' || str.charAt(j) == 'O' || 
                str.charAt(j) == 'U') {
                count++;
            }
        }
        for (int j = 0; j < str1.length(); j++) {
            if (str1.charAt(j) == 'a' || str1.charAt(j) == 'e' || str1.charAt(j) == 'i' ||
                str1.charAt(j) == 'o' || str1.charAt(j) == 'u' || str1.charAt(j) == 'A' ||
                str1.charAt(j) == 'E' || str1.charAt(j) == 'I' || str1.charAt(j) == 'O' || 
                str1.charAt(j) == 'U') {
                count1++;
            }
        }
        if(count==count1)
        {
            return true;
        }
        else
        {
            return false;
        }
        //return count==count1;
    }
}