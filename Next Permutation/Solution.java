class Solution {
    public void nextPermutation(int[] nums) {
        int n =nums.length;
        int ind = -1;
        for(int i = n-2; i>= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            for(int i =0; i < n /2; i++) {
                int temp = nums[i];
                nums[i] = nums[n - 1 - i];
                nums[n - 1 - i] = temp;
            }
            return;
        }
        for(int i= n-1; i>ind; i--) {
            if(nums[i] > nums[ind]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        int start = ind +1, end = n-1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return;
    }
}