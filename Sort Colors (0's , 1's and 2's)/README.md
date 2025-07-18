**Problem to Solve in Leetcode:**

https://leetcode.com/problems/sort-colors/

**Intuition Behind the Dutch National Flag Algorithm**


The problem is similar to sorting three categories, which is effectively what the Dutch National Flag problem addresses.

**Key idea:**


![WhatsApp Image 2025-07-19 at 00 54 18_5f47023f](https://github.com/user-attachments/assets/987b2d47-dbad-4b6e-946a-39509e917469)


**Maintain three pointers:**

low (initially at the start)

mid (initially at the start)

high (initially at the end)


**Dry Run & Intuition**


We traverse the array using the mid pointer:

If nums[mid] == 0, swap it with nums[low], increment low and mid.

If nums[mid] == 1, just move mid forward.

If nums[mid] == 2, swap it with nums[high], decrement high.

**This ensures:**

All 0s are moved to the front.

All 2s are moved to the end.

Remaining elements (1s) stay in the middle.

**Why does this work?**

Because each swap places an unknown element into its correct part, and by adjusting the pointers, we ensure the process converges in a single pass (O(n) time complexity).

**Benefits of This Approach**


Single-pass: Efficiently sorts in O(n) time.

In-place: Uses only constant extra space.

Simple & Intuitive: Mimics the process of sorting three partitions, like a classical Dutch flag.


**Below is my solution screenshot:**

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/7d853ed7-8fde-4ff4-b08d-673012e5c3a9" />

