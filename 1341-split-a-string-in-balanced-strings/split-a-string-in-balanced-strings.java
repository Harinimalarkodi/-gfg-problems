class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                l++;
            }
            else
            {
                r++;
            }
            if(l==r){
                count++;
                r=0;
                l=0;
            }

        }
        return count;
    }
}