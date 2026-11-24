class Solution {
    public int myAtoi(String s) {
        Set<Character> values = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    
        StringBuilder sb = new StringBuilder();
        String newS = s.trim();
        int startPoint = 0;
        if (newS.isBlank()) {
            return 0;
        }
        if (newS.charAt(0) == '-' || newS.charAt(0) == '+') {
            sb.append(newS.charAt(0));
            startPoint = 1;
        }

        boolean flag = true;

        for (int i=startPoint; i<newS.length(); i++) {
            char c = newS.charAt(i);
            if (flag && c == '0') {
                continue;
            }
            flag = false;
            if (!values.contains(c)) {
                break;
            } else {
                sb.append(c);
            }
        }

        String value = sb.toString();

        long result = 0;
        for (int i=0; i<value.length(); i++) {
            if (!values.contains(value.charAt(i))) {
                continue;
            }
            result *= 10;
            result += Math.abs(value.charAt(i) - '0');

            if (result > Integer.MAX_VALUE) {
                if (startPoint == 1 && value.charAt(0) == '-') {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
        }
        if (startPoint == 1 && value.charAt(0) == '-') {
            return (int) -result; 
        }
        return (int) result;
    }
}