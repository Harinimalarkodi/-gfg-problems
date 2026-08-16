class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder();
        sb.append("a");
        while(sb.length()<k){
            String res="";
            for(char c:sb.toString().toCharArray()){
                int ch=(int)(((c-'a')+1)%26);
                char z=(char)(ch+'a');
                res+=z;
            }
            sb.append(res);
            
        }
        String ans=sb.toString();
        return ans.charAt(k-1);
    }
}