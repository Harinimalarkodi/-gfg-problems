class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String combine=s1+" "+s2;
        String[] s3=combine.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String x:s3){
            map.put(x,map.getOrDefault(x, 0) + 1);
        }
        List<String> a=new ArrayList<>();
        for(String x:map.keySet())
        if(map.get(x)==1){
            a.add(x);
        }
        return a.toArray(new String[0]);

        
    }
}