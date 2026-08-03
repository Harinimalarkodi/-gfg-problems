class Solution {
    public boolean consecutiveSetBits(int n) {
        String ab=Integer.toBinaryString(n);
       int v=ab.length();
       int count=0;
        for(int i=0;i<=v-2;i++){
            String res=ab.substring(i,i+2);
            if(res.equals("11")){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}