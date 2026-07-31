class Solution {
    public boolean checkIfPangram(String sentence) {
        String s=sentence.toLowerCase();
        for(char i='a';i<='z';i++){
    
         if(s.indexOf(i)==-1){
             return false;
            

          }
         }
        return true;
    }
}