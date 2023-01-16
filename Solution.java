class Solution {
    public int findComplement(int num) {
        int stop = 31;
        for (int bit = 31; bit >= 0; bit--) {
            if (hasBit(num, bit)) {
                stop = bit;
                break;
            }
        }
        int ans = 0;
        for (int bit = 0; bit <= stop; bit++) {
            int curBit = (hasBit(num, bit) ? 1 : 0);
            // System.out.print(curBit + " -> ");
            curBit = curBit ^ (1 ^ 0);
            // System.out.println(curBit);
            if (curBit == 1) {
                ans += (1 << bit);
            }
        }
        return ans;
    }
    
    public boolean hasBit(int val, int bit) {
        return (val & (1 << bit)) != 0;
    }
}
