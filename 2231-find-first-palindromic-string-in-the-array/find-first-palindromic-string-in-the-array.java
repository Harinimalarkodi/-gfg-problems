class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s:words){
            int l=0;
            int r=s.length()-1;
            boolean b=true;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    b=false;
                    break;
                }
                l++;
                r--;
            }
            if(b) return s;
        }
        return "";
    }
}