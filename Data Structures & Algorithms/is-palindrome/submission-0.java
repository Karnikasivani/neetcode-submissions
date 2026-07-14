class Solution {
    public boolean isPalindrome(String s) {
        String stripped = s.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder word = new StringBuilder(stripped.toLowerCase());
        word.reverse();
        return word.toString().equals(stripped.toLowerCase());
    }
}
