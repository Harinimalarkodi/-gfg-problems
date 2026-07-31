class Solution {
    public boolean checkRecord(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
           
            char s1=s.charAt(i);
            if(s1=='A'){
                count++;

            }
            if(count>=2){
                return false;
            }
        }
        String s2="";
        int k=3;
        
        for(int i=0;i<s.length();i++){
            s2=s2+s.charAt(i);
            if(s2.length()>k){
                s2=s2.substring(1);
            }
            if(s2.length()==k){
                if(s2.startsWith("LLL")){
                    return false;
                }
                
            }
            
        }
          return true;
        
    }
}