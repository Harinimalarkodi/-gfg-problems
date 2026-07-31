class Solution {
    public int countSegments(String s) {
        s=s.trim();
        String[] s1=s.split("\\s+");
         if(s == null || s.isEmpty()) return 0;
        int count=0;
        for(String word:s1){
            count++;
        }
        return count;
        
    }
}