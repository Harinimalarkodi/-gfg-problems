class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer>a=new ArrayList<>();
      char []ch=p.toCharArray();
      Arrays.sort(ch);
      String h=new String(ch);
      int k=p.length();
      for(int i=0;i<=s.length()-p.length();i++){
        String s1=s.substring(i,i+k);
        char []ch1=s1.toCharArray();
         Arrays.sort(ch1);
        String h1=new String(ch1);
      if(h.equals(h1)){
        a.add(i);
      }

      }
      return a;
    }
}