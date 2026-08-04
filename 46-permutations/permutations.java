class Solution {
    List<List<Integer>>a=new ArrayList<>();
  public List<List<Integer>> permute(int[] nums) {
     boolean[] used=new boolean[nums.length];
     permute(nums,used,new ArrayList<>());
        return a;
    }
    public void permute(int []nums,boolean []used,List<Integer>b){
        if(b.size()==nums.length){
            a.add(new ArrayList<>(b));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            b.add(nums[i]);
            used[i]=true;
            permute(nums,used,b);
            b.remove(b.size()-1);
            used[i]=false;
        }
    }
}