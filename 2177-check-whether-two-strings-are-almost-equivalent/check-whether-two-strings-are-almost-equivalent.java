class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(char s:word1.toCharArray()){
            freq1[s-'a']++;
        }
        for(char s:word2.toCharArray()){
            freq2[s-'a']++;
        }
        for(int i=0;i<freq1.length;i++){
            if(Math.abs(freq1[i]-freq2[i])>3){
                return false;
            }
        }
        return true;
    }
}