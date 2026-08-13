class Solution {
   static List<List<Integer>>a=new ArrayList<>();
    public int subsetXORSum(int[] nums) {
     a.clear();
     subset(nums,0,new ArrayList<>());
     int sum=0;
     for(List<Integer>i:a){
        int xor=0;
        for(int c:i){
            xor=xor^c;
        }
       sum=sum+xor;
     }
        return sum;
    }
    public static void subset(int[]nums,int ind,List<Integer>b){
        a.add(new ArrayList<>(b));
        for(int i=ind;i<nums.length;i++){
            b.add(nums[i]);
            subset(nums,i+1,b);
            b.remove(b.size()-1);
        }
        
    }
}