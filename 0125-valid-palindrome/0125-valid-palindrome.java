class Solution {
    public boolean isPalindrome(String s) {
        
        String tempStr = "";

        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                tempStr += Character.toLowerCase(c);
            }
        }

        StringBuffer str = new StringBuffer(tempStr);
        str.reverse();

        if(str.toString().equals(tempStr)){
            return true;
        }

        return false;
    }
}