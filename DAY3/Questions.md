🔹 Question 7 — Character Frequency in String

Count how many times each character appears in a string.
Input: "programming"
Output:

p → 1
r → 2
o → 1
g → 2
a → 1
m → 2
i → 1
n → 1

📌 Rules:
Use arrays (no HashMap yet)
Assume lowercase letters only

Question 8 — Move All Zeros to End
Rearrange array so all 0s move to the end without changing order of others.
Input: {1, 0, 3, 0, 5, 0, 7}
Output: {1, 3, 5, 7, 0, 0, 0}

🔹 Question 9 — Check Anagram (Strings)
Two strings are anagrams if they contain the same characters.

Input: "listen", "silent"
Output: Anagram

📌 Constraint:
No sorting
Use frequency logic

ans
`
import java.util.Arrays;

class ans9_sorting {
public static void main(String[] args) {
String str1 = "listen";
String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}
`
