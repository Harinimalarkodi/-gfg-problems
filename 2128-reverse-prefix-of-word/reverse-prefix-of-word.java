class Solution {
    public String reversePrefix(String word, char ch) {
    char[]a=word.toCharArray();
    int j=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==ch){
            j=i;
            break;

        }
        
    }
    int start=0;
    int end=j;
    while(start<end)
    {
         char temp=a[start];
         a[start]=a[end];
         a[end]=temp;
         start++;
         end--;
    }
    
    String s=new String(a);
    return s;
    
    }
}