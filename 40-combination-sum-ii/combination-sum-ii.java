class Solution {
    List<List<Integer>>a=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] can, int tar) {
        Arrays.sort(can);
        subset(can,0,new ArrayList<>(),tar);
        return a;

        
    }
    public void subset(int[]can,int ind,List<Integer>b,int tar){

        int sum=0;
        for(int i:new ArrayList<>(b)){
            sum=sum+i;
        }
        if(sum==tar){
            a.add(new ArrayList<>(b));
        }
        if(sum>tar){
            return;
        }
        for(int i=ind;i<can.length;i++){
            if(i > ind && can[i] == can[i-1]){
    continue;
}
            b.add(can[i]);
            subset(can,i+1,b,tar);
            b.remove(b.size()-1);
        }
    }
}