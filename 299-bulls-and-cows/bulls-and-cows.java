class Solution {
    public String getHint(String s, String a) {
        int n=s.length();
        int b=0;
        int c=0;
        List<Character>s1=new ArrayList<>();
        List<Character>a1=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        for(int i=0;i<a.length();i++){
            a1.add(a.charAt(i));
        }
    
        
        
         for (int i = s1.size() - 1; i >= 0; i--) {
            if (s1.get(i) == a1.get(i)) {
                b++;
                s1.remove(i);
                a1.remove(i);
            }
        }

       
        for (int i = 0; i < s1.size(); i++) {
            char ch = s1.get(i);

            if (a1.contains(ch)) {
                c++;
                a1.remove(Character.valueOf(ch));
            }
        }

        return b + "A" + c + "B";
        
    }
}