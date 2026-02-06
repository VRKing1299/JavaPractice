🔹 Question 13 — String Compression

“aaabbc” → “a3b2c1”

🧠 What the problem is asking
You’re given a string with repeated characters.
You need to:
Count consecutive repeating characters
Replace them with:
character + count

🔎 Step-by-step thinking
For "aaabbc":

Characters Count Output
aaaa... 3 a3
bb 2 b2
c 1 c1

So final output:
👉 "a3b2c1"

🧪 More examples
"xxxx" → "x4"
"abc" → "a1b1c1"
"aabcc" → "a2b1c2"

🎯 What the interviewer tests
Loop control
Counting runs of characters
Edge cases (last character group)

🔹 Question 14 — Find Duplicate Elements in Array

{1, 2, 3, 2, 4, 1} → 1 2

🧠 What the problem is asking
From the array:
Print elements that appear more than once
Each duplicate should be printed only once

🔎 Step-by-step thinking

Array: {1, 2, 3, 2, 4, 1}

Element Appears Duplicate?
1 2 times ✅
2 2 times ✅
3 1 time ❌
4 1 time ❌

Output:
👉 1 2

⚠️ Important detail
Do NOT print duplicates multiple times.
For example:
If 2 appears 3 times → still print 2 only once.

🎯 What the interviewer tests
Nested loops or frequency logic
Avoiding repeated outputs
Basic array discipline

🔹 Question 15 — Check if Array is Sorted

{1, 2, 3, 4, 5} → Sorted

🧠 What the problem is asking
Check whether the array elements are in:
Ascending order

🔎 Step-by-step thinking

You compare:
arr[0] <= arr[1] <= arr[2] <= ...
If at any point:
arr[i] > arr[i+1]
→ The array is not sorted

🧪 Examples
Input Output
{1, 2, 3, 4} Sorted
{1, 3, 2} Not Sorted
{5, 4, 3} Not Sorted

🎯 What the interviewer tests
Loop traversal
Early exit on failure
Logical comparisons

🧭 How You Should Approach These (Mental Model)

Before coding, always ask:
1️⃣ What exactly changes when the input changes?
2️⃣ What should I print only once?
3️⃣ When should I stop the loop early?

If you can answer these in words, the code becomes mechanical.
