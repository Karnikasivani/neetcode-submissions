class Solution {
    public boolean isPalindrome(String s) {
        String word = s.replaceAll("[^a-zA-Z0-9]", "");
        word = word.toLowerCase();
        System.out.println(word);
        int left=0,right=word.length()-1;
        while(left < right) {
            if(!(word.charAt(left) == word.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}
