class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            String sentences2[]=sentences[i].split(" ");
            ans=Math.max(ans,sentences2.length);
        }
        return ans;
    }
}