class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref=new int[nums.length];
       pref[0]=1;
      for(int i=1;i<nums.length;i++){
        pref[i]=pref[i-1]*nums[i-1];
      }
      int suffix=1;
      for(int i=pref.length-1;i>=0;i--){
        pref[i]*=suffix;
        suffix*=nums[i];
      }
      return pref;

    }
}