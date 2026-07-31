class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>>a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int t=i;
            int l=i;
            while(l+1<s.length()&&s.charAt(l)==s.charAt(l+1)){
                l++;
            }
            i=l;
            if((l-t+1)>=3){
                List<Integer>b=new ArrayList<>();
                b.add(t);
                b.add(l);
                a.add(b);
            }
        }
        return a;
    }
}