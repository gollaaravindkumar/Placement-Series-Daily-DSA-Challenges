class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0;i<n;i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
}