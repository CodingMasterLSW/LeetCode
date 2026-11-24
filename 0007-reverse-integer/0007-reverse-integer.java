class Solution {
    public int reverse(int x) {
        
        long tmp = 0;
        while(x != 0) {
            tmp *= 10;
            tmp += x % 10;
            x /= 10;    
        }
        if (Math.abs(tmp) >= Integer.MAX_VALUE) {
            return 0;
        }
        return (int) tmp;
    }
}