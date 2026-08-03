class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int steps=0;
        List<Integer>a=new ArrayList<>();
        for(int i=nums.size()-1;i>=0;i--){
            a.add(nums.get(i));
            int count=0;
            steps++;
            for(int j=1;j<=k;j++){
                if(a.contains(j)){
                    count++;
                }

            }
            if(count==k){
                return steps;
            }
            else{
                continue;
            }
        }
        return steps;
    }
}