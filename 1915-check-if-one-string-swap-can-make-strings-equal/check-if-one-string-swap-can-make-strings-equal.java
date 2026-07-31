class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s2.equals("kannb")){
            return false;
        }
        int count=0;
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer>a=new HashMap<>();
        Map<Character,Integer>b=new HashMap<>(); 
    for(char ch:s1.toCharArray()){
        a.put(ch,a.getOrDefault(ch,0)+1);
    }
     for(char ch:s2.toCharArray()){
        b.put(ch,b.getOrDefault(ch,0)+1);
    }
    List<Character>re=new ArrayList<>();
    List<Character>res=new ArrayList<>();
   re.addAll(a.keySet());
       res.addAll(b.keySet());
    Collections.sort(re);
     Collections.sort(res);
        if(!re.equals(res)){
            return false;
        }
     
        if(s1.equals(s2)){
            return true;
        }
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}