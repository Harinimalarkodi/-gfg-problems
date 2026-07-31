class Solution {
    public int[] shortestToChar(String s, char c) {
        int ind=0;
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int m=Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    int n=Math.abs(i-j);
                    m=Math.min(n,m);
                }
                
            }
            arr[i]=m;

        }
        return arr;
    }
}