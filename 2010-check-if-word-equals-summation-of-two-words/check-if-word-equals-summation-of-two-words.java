class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int n=0;
       for(int i=0;i<firstWord.length();i++){
            int a=(int)firstWord.charAt(i)-'a';
            n=n*10+a;
           }
           int n1=0;
       for(int i=0;i<secondWord.length();i++){
            int a=(int)secondWord.charAt(i)-'a';
            n1=n1*10+a;
           }
           int t=0;
       for(int i=0;i<targetWord.length();i++){
            int a=(int)targetWord.charAt(i)-'a';
            t=t*10+a;
           }
           int sum=n+n1;
           if(sum!=t){
            return false;
           }

        return true;
    }
}