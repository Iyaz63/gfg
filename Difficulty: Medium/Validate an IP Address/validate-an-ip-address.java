class Solution {

    public boolean isValid(String s) {
        // Write your code here
        String[] parts = s.split("\\.");
        if (parts.length != 4) return false;

        for (String part : parts) {
            // Check if part is empty or has leading zeros
            if (part.isEmpty() || (part.length() > 1 && part.charAt(0) == '0')) return false;

            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}