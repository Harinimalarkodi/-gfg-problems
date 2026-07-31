class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>(); 
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++){
                int s = j + 1, e = nums.length - 1;

                while(s < e){
                    long sum = (long)nums[i] + nums[j] + nums[s] + nums[e];

                    if(sum == target){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[s], nums[e]);
                        Collections.sort(list);
                        if(!set.contains(list)){
                           l.add(list);
                           set.add(list);
                        }
                        
                        s++;
                        e--;
                    }
                    else if(sum > target){
                        e--;
                    }
                    else{
                        s++;
                    }
                }
            }
        }
        return l;
    }
}