**Problem to Solve in Leetcode:**

https://leetcode.com/problems/missing-number/

**Below is my solution screenshot:**

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/a76fe5a3-f7bd-454a-8f91-515b085c337e" />

However, **SUM** approach may encounter issues with integer overflow when n becomes very large (e.g., n up to 10^5 or more), since n * (n + 1) can surpass the maximum value for a 32-bit integer (Integer.MAX_VALUE).

To handle larger input sizes safely, an alternative approach is to use the XOR method, which avoids overflow concerns:

XOR all array elements with the range [0, n].
The result will be the missing number.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ea3f8004-0c5a-4f11-b878-94c06c11ede9" />

Advantages of XOR approach:

No risk of integer overflow.
Slightly better performance for very large inputs due to avoiding arithmetic operations that may lead to overflow checks.
Note: When working with very large input sizes, prefer the **XOR** approach

