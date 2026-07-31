class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        int count=0;
        Map<Character,Integer>a=new HashMap<>();
        for(int i=0;i<3;i++){
            char b=s.charAt(i);
            a.put(b,a.getOrDefault(b,0)+1);

        }
        if(a.size()==3){
            count++;
        }
        for(int i=1;i<=s.length()-3;i++){
            char l=s.charAt(i-1);
            a.put(l,a.get(l)-1);
            if(a.get(l)==0){
                    a.remove(l);
            }
            char right=s.charAt(i+2);
            a.put(right,a.getOrDefault(right,0)+1);
            if(a.size()==3){
            count++;
            }
        }
        return count;
        
    }
}