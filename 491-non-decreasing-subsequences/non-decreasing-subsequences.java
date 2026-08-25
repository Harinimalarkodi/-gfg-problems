class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();

    solve  (nums,0,new ArrayList<>(),a);
    return a;
    }
    public void solve(int[]nums,int ind,List<Integer>b,List<List<Integer>>a){
     
                  if(b.size()>=2){
                    a.add(new ArrayList<>(b));
                  }
                  Set<Integer>used=new HashSet<>();

                  for(int i=ind;i<nums.length;i++){
                    if(used.contains(nums[i])){
                        continue;
                    }
                    used.add(nums[i]);
                    if(b.isEmpty()||nums[i]>=b.get(b.size()-1)){
                    b.add(nums[i]);
                    solve(nums,i+1,b,a);
                    b.remove(b.size()-1);
                    }
                  }
    }
}