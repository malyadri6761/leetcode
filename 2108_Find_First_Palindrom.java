class Solution {
    public String reverse(String str){
        char ch[]=str.toCharArray();
        for(int i=0;i<(ch.length)/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        String s=String.valueOf(ch);
        return s;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(words[i].equals(reverse(words[i])))
                return words[i];
        }
        return "";
    }
}
