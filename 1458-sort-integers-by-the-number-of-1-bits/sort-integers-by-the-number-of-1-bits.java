class Solution {
    public int[] sortByBits(int[] arr) {
      TreeMap<Integer,List<Integer>>a=new TreeMap<>();
       for(int i:arr) {
           int n=Integer.bitCount(i);
           if(!a.containsKey(n)){
            a.put(n,new ArrayList<>());
           }
           a.get(n).add(i);
       }
       int []ans=new int[arr.length];
       int ind=0;
       for(List<Integer>b:a.values()){
        Collections.sort(b);
        for(int nums:b){
            ans[ind++]=nums;
        }
       }
return ans;
    }
}