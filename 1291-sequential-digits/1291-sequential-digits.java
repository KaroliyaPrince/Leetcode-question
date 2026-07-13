class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=1;i<=9;i++){
            GetNumber(i, i, low, high, ans);
        }

        Collections.sort(ans);

        return ans;
    }

    public void GetNumber(int number, int lastDigit,int low, int high,List<Integer> ans){
        
        if(number > high){
            return;
        }

        if(number >= low){
            ans.add(number);
        }

        if(lastDigit == 9){
            return;
        }

        GetNumber(number*10 + (lastDigit+1), lastDigit+1, low, high, ans);
    }
}