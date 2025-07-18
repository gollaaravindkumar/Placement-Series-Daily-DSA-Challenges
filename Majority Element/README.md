**Problem to Solve in Leetcode:**

https://leetcode.com/problems/majority-element/

**Intuition Behind Moore's Voting Algorithm**

**Moore's Voting Algorithm** is an efficient method to find the majority element in linear time and constant space. The core idea is based on counting and canceling out different elements:

**Key concept:**

Keep track of a candidate for the majority element.

Maintain a count that gets incremented when the current element matches the candidate, and decremented otherwise.

When the count reaches zero, choose the next element as the new candidate.

**Why does this work?**

Since the majority element appears more than half the times, it will remain as the candidate at the end of the process.

**Dry Run & Intuition**

Initialize candidate with an arbitrary value and count as 0.

Iterate through the array:

If count is 0, set the current element as the new candidate.

If the current element equals candidate, increment count.

Otherwise, decrement count.

After the first pass, candidate will hold the element that potentially is the majority.

Verify the candidate by counting its occurrences in a second pass (optional if problem guarantees majority element).

**Below is my solution screenshot:**

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/fe798c25-ca72-4df4-b2a3-7415f4c93c5a" />

