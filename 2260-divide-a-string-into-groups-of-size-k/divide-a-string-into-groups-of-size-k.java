class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> a=new ArrayList<>();
        String ab="";
        for(int i=0;i<s.length();i++){
            ab+=s.charAt(i);
            
            if(ab.length()==k){
                a.add(ab);
                ab="";
            }
        }
             if(ab.length()>0){
                while(ab.length()<k){
                    ab+=fill;

                }
                a.add(ab);
             
            }
            

        
        return a.toArray(new String[0]);
        
    }
}