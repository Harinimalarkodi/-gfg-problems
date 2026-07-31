class Solution {
    public int numberOfSubstrings(String s) {
         int n=atmost(s,3)-atmost(s,2);
         return n;
    }
    public  int  atmost(String s,int k){
        Map<Character,Integer>a=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            a.put(ch,a.getOrDefault(ch,0)+1);
            while(a.size()>k){
                char l=s.charAt(left);
                a.put(l,a.get(l)-1);
                if(a.get(l)==0){
                    a.remove(l);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}