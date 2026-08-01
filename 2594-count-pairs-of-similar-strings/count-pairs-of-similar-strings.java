class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            TreeSet<Character>a=new TreeSet<>();
            for(char ch:s.toCharArray()){
                a.add(ch);
            }
            for(int j=i+1;j<words.length;j++){
                 String s1=words[j];
            TreeSet<Character>b=new TreeSet<>();
            for(char ch:s1.toCharArray()){
                b.add(ch);
            } 
            if(b.equals(a)){
                count++;
            }
            }
        }
        return count;
    }
}