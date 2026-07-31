class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        int count=0;
        int lc=0;
        int s=0;
        int d=0;
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
            else if(Character.isLowerCase(ch)){
                lc++;
            }
             else if(!Character.isLetterOrDigit(ch)){
                s++;
            }
            else if(Character.isDigit(ch)){
                d++;
            }

        }
        if(count==0||lc==0||s==0||d==0){
            return false;
        }
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i+1)){
                return false;
            }
        }
         return true;
        
    }
}