class Solution {
    public int percentageLetter(String s, char letter) {
        String str=s.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        int ab=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a==letter){
                ab++;
            }
        }
        int n=((ab*100)/count);
        return n;
        

        
        
    }
}