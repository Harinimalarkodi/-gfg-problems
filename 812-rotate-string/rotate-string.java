class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            String r=s.substring(i)+s.substring(0,i);
            if(r.equals(goal)){
                return true;
            }
        }
      return false;
        
    }
}