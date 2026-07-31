class Solution {
    public String makeGood(String s) {
        Stack<Character>a=new Stack<>();
        a.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
             char ch = s.charAt(i);

            if (!a.isEmpty() &&
               Character.toLowerCase(a.peek()) == Character.toLowerCase(ch) &&
               a.peek() != ch) {

                a.pop();
            }
            else {
                a.push(ch);
            }
                
            }
        
            String g="";
            for(char e:a){
                g=g+e;
            }
            return g;
        
    }
}