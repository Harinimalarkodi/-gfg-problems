class Solution {
    public int[] numberOfPairs(int[] nums) {
        List<Integer>a=new ArrayList<>();
        for(int i:nums){
            a.add(i);
        }
        int freq[]=new int[101];
        for(int i:nums){
            freq[i-0]++;
        }
        int count=0;
        int rem=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0&&freq[i]%2==0){
                count+=freq[i]/2;
            }
            else if(freq[i]!=0&&freq[i]%2!=0){
              count+=(freq[i]-1)/2;
            }
        }
        for(int i=0;i<freq.length;i++){
           
        if(freq[i]%2!=0){
              rem++;
            }
        }
        
        int ans[]=new int[2];
        ans[0]=count;
        ans[1]=rem;
        return ans;
    }
}