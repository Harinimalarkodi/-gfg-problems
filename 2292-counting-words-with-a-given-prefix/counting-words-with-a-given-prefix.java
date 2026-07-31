class Solution {
    public int prefixCount(String[] words, String pref) {
        int ind=0;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            if(a.startsWith(pref)){
                ind++;
            }
        }
        return ind;
    }
}