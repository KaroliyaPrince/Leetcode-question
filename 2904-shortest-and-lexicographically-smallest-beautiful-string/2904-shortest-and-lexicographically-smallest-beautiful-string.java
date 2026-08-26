class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int len = Integer.MAX_VALUE;
        int strLen = 0;
        String ansStr = "";
        String tempStr = "";
        int temp = 0;

        for(int i=0 ; i<s.length() ; i++){
            for(int j=i ; j<s.length() ; j++){
                temp = 0;
                strLen = 0;
                tempStr = "";
                for(int h=i ; h<=j ; h++){
                    if(s.charAt(h) == '1'){
                        temp++;
                    }
                    strLen++;
                    tempStr += s.charAt(h);

                }

                if(temp == k){
                    if(strLen < len){
                        len = strLen;
                        ansStr = tempStr;
                    }

                    else if(strLen == len && tempStr.compareTo(ansStr) < 0){
                        ansStr = tempStr;
                    }
                }
            }
        }

        return ansStr;
    }
}