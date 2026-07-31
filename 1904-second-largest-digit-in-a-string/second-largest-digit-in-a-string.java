class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int secondmax=-1;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            int n=ch-'0';
           if(n>max){
                    secondmax=max;
                    max=n;
           }
           else if (n < max && n > secondmax) {
                    secondmax = n;  // update second max if between
                }

        }
       }
       
        return secondmax;
        
    }
}