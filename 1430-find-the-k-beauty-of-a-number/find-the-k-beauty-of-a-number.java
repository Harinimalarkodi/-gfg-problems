class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int count=0;
        int left=0;
        String s="";
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++){
            s+=str.charAt(i);
            if(s.length()>k){
              s=s.substring(1);
            }
            
            if(s.length()==k){
                int n=Integer.parseInt(s);
                
                if(n!=0&&num%n==0){
                    count++;
                }
            }
            
        }
        return count;
    }
}
