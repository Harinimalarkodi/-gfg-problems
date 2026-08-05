class Solution {
    public int numSplits(String s) {
        int left[]=new int[26];
        int right[]=new int[26];
        int rc=0;
        int lc=0;
        for(char ch:s.toCharArray()){
            if(right[ch-'a']==0){
                rc++;
            }
            right[ch-'a']++;
        }
       int count=0;
        for(int i=0;i<s.length()-1;i++){
          char ch=s.charAt(i);
          if(left[ch-'a']==0){
            lc++;
          }
          left[ch-'a']++;
          right[ch-'a']--;
          if(right[ch-'a']==0){
            rc--;
          }
          if(rc==lc){
            count++;
          }
         
        }
        return count;
    }
        
    }
