class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character>a=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                a.push(ch);
                
            }
            else
            {
                if(!a.isEmpty()){
                
                a.pop();
                }
            }
        }
        String s1="";
        for(char ch:a){
            s1=s1+ch;
        }
        Stack<Character>b=new Stack<>();
        
        for(char ch:t.toCharArray()){
            if(ch!='#'){
                b.push(ch);
                
            }
            else
            {
              if(!b.isEmpty()){
                
                b.pop();
                }
            }
        }
        String s2="";
        for(char ch:b){
            s2=s2+ch;
        }
        if(s1.equals(s2)){
            return true;
        }
        
        return false;
    }
}