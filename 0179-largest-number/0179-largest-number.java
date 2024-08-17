class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(str,(b,a)-> (a+b).compareTo(b+a));
        StringBuilder str1 = new StringBuilder(n);

        for(int i=0;i<n;i++){
            str1.append(str[i]);
        }
        if(str1.charAt(0)=='0')
           return "0";
        else
           return str1.toString();
    }
}