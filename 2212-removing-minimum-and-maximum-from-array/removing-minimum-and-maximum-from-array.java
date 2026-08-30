class Solution {
    public int minimumDeletions(int[] nums) {
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int minindex=0;
        int max=Integer.MIN_VALUE;
        int maxindex=0;
        int count=0;
        int mid=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }
        }
       
       int left = Math.max(minindex, maxindex) + 1;

int right = len - Math.min(minindex, maxindex);

int both = Math.min(minindex, maxindex) + 1
         + len - Math.max(minindex, maxindex);

return Math.min(left, Math.min(right, both));
        
           
    }
}