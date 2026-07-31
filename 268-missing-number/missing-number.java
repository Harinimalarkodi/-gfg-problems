class Solution {
    public int missingNumber(int[] nums) {
       
      
        int n1=nums.length;
        int n2=(n1*(n1+1))/2;
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        int m=n2-sum;
        return m;
        
    }
}