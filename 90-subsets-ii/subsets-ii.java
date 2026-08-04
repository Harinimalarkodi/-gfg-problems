class Solution {
    List<List<Integer>>a=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(nums,0,new ArrayList<>());
        return a;
    }
    public void subset(int[]nums,int ind, List<Integer>b){
        // if(!a.contains(b)){
          a.add(new ArrayList<>(b));
           

        // }
        // if(i>ind&&nums[i]==nums[i-1]){
        //     continue;
        // }
        for(int i=ind;i<nums.length;i++){
            if(i>ind&&nums[i]==nums[i-1]){
            continue;
        }
            b.add(nums[i]);
            subset(nums,i+1,b);
            b.remove(b.size()-1);
        }
    }
}