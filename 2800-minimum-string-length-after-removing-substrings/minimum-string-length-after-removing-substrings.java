class Solution {
    public int minLength(String s) {
        
        Stack<Character>a=new Stack<>();
        a.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!a.isEmpty()&&((a.peek()=='A'&&s.charAt(i)=='B')||(a.peek()=='C'&&s.charAt(i)=='D'))){
                a.pop();
            }
            else{
                a.push(s.charAt(i));
            }
        }
        return a.size();
    }
}