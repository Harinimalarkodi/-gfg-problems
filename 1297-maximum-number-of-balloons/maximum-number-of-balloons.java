class Solution {
    public int maxNumberOfBalloons(String text) {
        int a[]=new int[26];
        for(char b:text.toCharArray()){
            a[b-'a']++;
        }
        int[] a1 = new int[5];
        a1[0] = a['b' - 'a'];
        a1[1] = a['a' - 'a'];
        a1[2] = a['l' - 'a'] / 2; // 'l' appears twice
        a1[3] = a['o' - 'a'] / 2; // 'o' appears twice
        a1[4] = a['n' - 'a'];
          int min=Integer.MAX_VALUE;
          for(int i=0;i<a1.length;i++)     {
            if(a1[i]<min){
                min=a1[i];
            }
          }
          return min;

        
        
    }
}