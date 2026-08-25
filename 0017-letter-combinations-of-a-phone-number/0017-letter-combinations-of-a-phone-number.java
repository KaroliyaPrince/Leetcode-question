class Solution {

    static String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    List<String> ans = new ArrayList<String>();

    public void rec(int i , StringBuilder ansStr , String digits){
        if(i >= digits.length()){
            ans.add(ansStr.toString());
            return;
        }

        for(int j=0 ; j<str[digits.charAt(i)-'0'].length() ; j++){
            ansStr.append(str[digits.charAt(i)-'0'].charAt(j));
            rec(i+1 , ansStr , digits);
            ansStr.deleteCharAt(ansStr.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        
        rec(0,new StringBuilder(),digits);
        return ans;

    }
}