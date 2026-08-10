class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        TreeMap<Integer,Integer>a=new TreeMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        List<Integer>b=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:a.entrySet()){
            if(entry.getValue()>k){
                int g=k;
                while(g>0){
                    b.add(entry.getKey());
                    g--;
                }
            }
            else{
                int g=entry.getValue();
                while(g>0){
                    b.add(entry.getKey());
                    g--;
                }
            }
        }
        int arr[]=new int[b.size()];
        int ind=0;
        for(int i:b){
            arr[ind]=i;
            ind++;
        }
        return arr;
    }
}