class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ 
            return false;
        };
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < t.length(); i++) {
            String str = String.valueOf(t.charAt(i));
            if(sb.toString().contains(str)){
                sb.deleteCharAt(sb.indexOf(str));
            }
        }
        return sb.toString().length() == 0;
    }
}
