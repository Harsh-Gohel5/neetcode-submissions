class Solution {
    public int mySqrt(int x) {
        // return (int) Math.sqrt(x);
        if(x == 0) {
            return x;
        }
        int result = 1;
        for(int i = 1; i <= x; i++) {
            if((long) i * i > x) {
                return result;
            }
            result = i;
        }
        return result;
    }
}