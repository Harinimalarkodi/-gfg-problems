class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer>a=new ArrayList<>();
        for(int i:nums){
             a.add(i);
        }
        int ans=0;
        int i=1;
        while(ans<=0){
          if(!a.contains(i*k)){
            ans=i*k;
            break;
          }
          else{
            i=i+1;
          }
        }
        return ans;
    }
}