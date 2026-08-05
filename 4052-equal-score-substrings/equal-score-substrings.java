class Solution {
    public boolean scoreBalance(String s) {
        int right=0;
        for(char ch:s.toCharArray()){
            int a=(int)ch-'a'+1;
           right+=a;
        }
        int left=0;
        for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         int n=(int)ch-'a'+1;
         left+=n;
         right-=n;
         if(left==right){
            return true;
         }
        }
        return false;
    }
}