class Solution {
    List<List<Integer>>a=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] can, int tar) {
        subset(can,0,new ArrayList<>(), tar);
        return a;
    }
    public void subset(int[] can,int ind,List<Integer>b,int tar){
        int sum=0;
        for(int ab:new ArrayList<>(b)){
            sum=sum+ab;
        }
        if(sum==tar){
            a.add(new ArrayList<>(b));
            return;
        }
        if(sum>tar){
            return;
        }
        for(int i=ind;i<can.length;i++){
            b.add(can[i]);
            subset(can,i,b,tar);
            b.remove(b.size()-1);
        }

    }
}