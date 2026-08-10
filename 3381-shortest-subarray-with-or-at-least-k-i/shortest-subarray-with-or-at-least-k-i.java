class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int len=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            List<Integer>a=new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                a.add(nums[j]);
                boolean ismin=special(a,k);
                if(ismin==true){
                    len=Math.min(len,a.size());
                }
            }
        }

        return len==Integer.MAX_VALUE?-1:len;
    }
    public static boolean special(List<Integer>a,int k){
        int or=0;
        for(int i:a){
            or|=i;
        }
        if(or>=k){
            return true;
        }
     return false;
    }
}