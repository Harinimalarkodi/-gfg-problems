class Solution {
    public String[] findWords(String[] words) {
        List<Character>a=new ArrayList<>();
               a.add('w');
                 a.add('q');
                   a.add('e');
                     a.add('r');
                       a.add('t');
                         a.add('y');
                           a.add('u');
                             a.add('i');
                             a.add('o');
                               a.add('p');

List<Character>b=new ArrayList<>();
    b.add('a');
    b.add('s');
    b.add('d');
    b.add('f');
    b.add('g');
    b.add('h');
    b.add('j');
    b.add('k');
    b.add('l');
    List<Character>c=new ArrayList<>();
    c.add('z');
    c.add('x');
    c.add('c');
       c.add('v');
        c.add('b');
         c.add('n');
          c.add('m');

        List<String>ans=new ArrayList<>();
        for(String i:words)    {
            String ori=i;
            int count1=0;
             int count2=0;
             int count3=0;
            i=i.toLowerCase();
            for(char ch:i.toCharArray()){
              if(a.contains(ch)){
                count1++;
              }
             else  if(b.contains(ch)){
                count2++;
              }
               else if(c.contains(ch)){
                count3++;
              }
            }
            if(i.length()==count1||i.length()==count2||i.length()==count3){
                ans.add(ori);
            }
        }                 
                             
         String [] res=new String[ans.size()]  ;
         int ind=0;
         for(String i:ans)    {
            res[ind]=i;
            ind++;
         }
return res;
               

    }
}