class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer>a=new HashMap<>();
        for(char ch:chars.toCharArray()){
            a.put(ch,a.getOrDefault(ch,0)+1);
        }
        int sum=0;
        for(int i=0;i<words.length;i++){
            Map<Character,Integer>b=new HashMap<>();
            String n=words[i];
            for(char ch:n.toCharArray()){
                b.put(ch,b.getOrDefault(ch,0)+1);
            }
            boolean is=true;
            for(char ch: n.toCharArray()){
                if(!a.containsKey(ch)){
                    is=false;
                    break;
                }
                if(a.get(ch)<b.get(ch)){
                    is=false;
                    break;
                }
            }
            if(is){
                sum=sum+n.length();
            }
        }
        return sum;
    }
}