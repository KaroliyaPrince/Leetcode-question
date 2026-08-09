class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String minStr = strs[0];
        String prefix = "";
        boolean flag = true;

        for(int i=0 ; i <strs.length ; i++){
            if(minStr.length() > strs[i].length()){
                minStr = strs[i];
            }
        }

        while(!minStr.equals("")){
            flag = true;
            for(int i=0 ; i<strs.length ; i++){

                prefix = strs[i].substring(0,minStr.length());
                if(!prefix.equals(minStr)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return minStr;
            }

            minStr = minStr.substring(0,minStr.length()-1);
        }
        return "";
    }

}