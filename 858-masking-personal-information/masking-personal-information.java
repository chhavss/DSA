class Solution {
    public String maskPII(String s) {
        if (s.contains("@")) {
            s = s.toLowerCase();

            int at = s.indexOf('@');
            return s.charAt(0) + "*****" + s.charAt(at - 1) + s.substring(at);
        }

        StringBuilder digits = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        int n = digits.length();
        String local = "***-***-" + digits.substring(n - 4);

        if (n == 10) {
            return local;
        }

        StringBuilder country = new StringBuilder("+");
        for (int i = 0; i < n - 10; i++) {
            country.append("*");
        }
        country.append("-");

        return country + local;
    }
}