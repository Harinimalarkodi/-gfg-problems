class Solution {
    public boolean digitCount(String num) {
        int n[] = new int[num.length()];
        
        
        for(int i = 0; i < num.length(); i++){
            n[i] = num.charAt(i) - '0';
        }

        int[] freq = new int[10];

        for(int i = 0; i < n.length; i++){
            freq[n[i]]++;
        }

      
        for(int i = 0; i < num.length(); i++){
            int required = num.charAt(i) - '0';
            if(freq[i] != required){
                return false;
            }
        }

        return true;
    }
}