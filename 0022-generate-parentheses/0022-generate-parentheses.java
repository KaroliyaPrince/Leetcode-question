class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        getAns("",0,0,ans,n);

        return ans;

    }

    public void getAns(String s , int open , int close,List<String> ans,int n){
         if (open == n && close == n) {
            ans.add(s);
            return;
        }

        if (open < n) {
            getAns(s + '(', open + 1, close, ans, n);
        }

        if (close < open) {
            getAns(s + ')', open, close + 1, ans, n);
        }
    }
}