class Solution {
    public int numOfStrings(String[] patterns, String word) {
        List<String>pat=new ArrayList<>();
        for(int i=0;i<patterns.length;i++){
            pat.add(patterns[i]);

        }
        List<String>sub=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                String res=word.substring(i,j);
                sub.add(res);

            }
        }
        int count=0;
        for(String ch:pat){
            if(sub.contains(ch)){
                count++;
            }
        }
        return count;
    }
}