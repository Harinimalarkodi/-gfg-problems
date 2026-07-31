class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String a=paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]"," ");
            List<String>ab=new ArrayList<>();
            String b[]=a.split(" ");
             Set<String> ban = new HashSet<>(Arrays.asList(banned));
        
        for(String d : b){
            if(!ban.contains(d) && !d.equals("")){
                ab.add(d);
            }
        }
            Map<String,Integer>s=new HashMap<>();
            for(String u:ab){
                s.put(u,s.getOrDefault(u,0)+1);
            }
           
            int max=Integer.MIN_VALUE;
            String x="";
            for(Map.Entry<String,Integer>entry:s.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    x=entry.getKey();
                   

                }
            }
       return x;
    }
}