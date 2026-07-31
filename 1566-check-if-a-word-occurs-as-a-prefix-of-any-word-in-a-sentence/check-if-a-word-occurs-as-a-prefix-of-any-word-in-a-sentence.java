class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int p=-1;
        String []a=sentence.split(" ");
        for(int i=0;i<a.length;i++){
            String b=a[i];
            if(b.startsWith(searchWord)){
                p=i+1;
                break;
                
            }
        }
        return p;
        
    }
}