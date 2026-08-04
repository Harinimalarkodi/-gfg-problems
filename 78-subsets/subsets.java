class Solution {
    List<List<Integer>>a=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
      subset(nums,0,new ArrayList<>());
      return a;
        
    }
    public void subset(int[]nums,int ind,List<Integer>b){
        a.add(new ArrayList<>(b));
        for(int i=ind;i<nums.length;i++){
            b.add(nums[i]);
            subset(nums,i+1,b);
            b.remove(b.size()-1);
        }
    }
}