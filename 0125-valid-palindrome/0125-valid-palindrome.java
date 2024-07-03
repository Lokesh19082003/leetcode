class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder normalized = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }
        String normalizedString = normalized.toString();
        String reversedString = normalized.reverse().toString();
        
        return normalizedString.equals(reversedString);
}
}