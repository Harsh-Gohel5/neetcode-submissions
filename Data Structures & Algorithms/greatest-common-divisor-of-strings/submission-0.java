class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int a = gcd(str1.length(), str2.length());
        return str1.substring(0, a);
    }
    private int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }
}