class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        char[]ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
      
        for(char c:ch){
            if(Character.isLetterOrDigit(c)){
               sb.append(c);
            }
        }
        String original = sb.toString();
        String reverse= sb.reverse().toString();

    return original.equals(reverse);
        
    }
}
