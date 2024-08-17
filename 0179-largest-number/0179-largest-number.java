class Solution
{
    public String largestNumber(int[] nums)
    {
        String numstr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            numstr[i]=String.valueOf(nums[i]);
        }    
//Arrays.sort(numstr,(a,b)->(b+a).compareTo(a+b));        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
               if ((numstr[i] + numstr[j]).compareTo(numstr[j] + numstr[i]) < 0)
                {
                    String temp=numstr[i];
                    numstr[i]=numstr[j];
                    numstr[j]=temp;
                }
            }
        }
        if(numstr[0].equals("0"))
        {
            return "0";
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numstr.length;i++)
        {
            res.append(numstr[i]);
        }
        return res.toString();
    }
}