class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashMap<Character,Integer> freq = new HashMap<>();
        int ans = 0;
        int j=0;

        for(int i=0 ; i<s.length() ; i++){
            freq.put(s.charAt(i) , freq.getOrDefault(s.charAt(i),0) + 1);

            while(freq.get(s.charAt(i)) > 2){
                freq.put(s.charAt(j) , freq.get(s.charAt(j)) - 1);
                j++;
            }

            ans = Math.max(ans,i-j+1);
        }

        return ans;
    }
}