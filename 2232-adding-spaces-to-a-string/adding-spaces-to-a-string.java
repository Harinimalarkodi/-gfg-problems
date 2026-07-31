class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder s1=new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(k<spaces.length&&i==spaces[k]){
                s1.append(' ');
                k++;
            }
            s1.append(s.charAt(i));
        }
        return s1.toString();
        
    }
}