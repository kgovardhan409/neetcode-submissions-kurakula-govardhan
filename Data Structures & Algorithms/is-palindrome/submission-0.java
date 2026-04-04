class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        String newStr = str.reverse().toString().replaceAll("[^a-zA-Z0-9]", "");
        String givenStr = s.toString().replaceAll("[^a-zA-Z0-9]", "");
        return givenStr.equalsIgnoreCase(newStr);
    }
}
