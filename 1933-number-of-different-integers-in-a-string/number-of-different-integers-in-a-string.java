class Solution {
    public int numDifferentIntegers(String word) {
        
         String s = word.replaceAll("[a-zA-Z]", " ");
        String[] a = s.split(" ");
        
        Set<String> b = new HashSet<>();
        
        for(String ch : a){
            if(!ch.isEmpty()){
                ch = ch.replaceFirst("^0+", "");
                if(ch.equals("")) ch = "0";
                b.add(ch);
            }
        }
        
        return b.size();
    }
}