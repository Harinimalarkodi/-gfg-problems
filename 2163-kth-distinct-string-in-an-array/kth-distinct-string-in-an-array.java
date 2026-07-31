class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer>a=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        }
        List<String>a1=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:a.entrySet()){
            if(entry.getValue()==1){
                a1.add(entry.getKey());

            }
        }
           return (k <= a1.size()) ? a1.get(k - 1) : "";
        
    }
}