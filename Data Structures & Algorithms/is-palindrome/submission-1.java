class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder str = new StringBuilder(cleaned);
        return cleaned.equals(str.reverse().toString());
    }
}
