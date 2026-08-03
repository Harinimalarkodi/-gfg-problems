class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shifts=0;
        while(left!=right){
            right>>=1;
            left>>=1;
            shifts++;
        }
        return left<<shifts;
    }
}