class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer>a=new TreeSet<>();
        for(int i:arr){
            a.add(i);
        }
        LinkedHashMap<Integer,Integer>res=new LinkedHashMap<>();
        int ind=1;
        for(int i:a){
            res.put(i,ind);
            ind++;
        }
        int ans[]=new int[arr.length];
       int index=0;
       for(int i:arr){
        ans[index++]=res.get(i);
       }
        return ans;
    }
}