class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer>b=new HashMap<>();
        for(String a:words1){
            b.put(a,b.getOrDefault(a,0)+1);

        }
        Map<String,Integer>c=new HashMap<>();
        for(String a:words2){
            c.put(a,c.getOrDefault(a,0)+1);

        }
        List<String>s=new ArrayList<>();
          for(Map.Entry<String,Integer>entry:b.entrySet()){
            if(entry.getValue()==1){
                s.add(entry.getKey());
            }
          }
          List<String >r=new ArrayList<>();
          for(Map.Entry<String,Integer>entry:c.entrySet()){
            if(entry.getValue()==1){
                r.add(entry.getKey());

            }
          }
          int count=0;
          for(int i=0;i<s.size();i++){
            if(r.contains(s.get(i))){
                count++;
            }
          }
        return count;
    }
}