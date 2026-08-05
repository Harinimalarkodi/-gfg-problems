class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        String left="";
        String right=s;
       int z=0;
       int one=0;
       for(char ch:s.toCharArray()){
        if(ch=='1'){
            one++;
        }
       }

        for(int i=0;i<s.length()-1;i++){
            
            if(s.charAt(i)=='0'){
                z++;
            }
            else if(s.charAt(i)=='1'){
                one--;
            }
            max=Math.max(max,z+one);
            
        }
        return max;
    }
}