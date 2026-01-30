// 🔹 Question

// Write a Java program to reverse a given string without using StringBuilder.reverse().

// 🔹 What the interviewer is testing

// Loops

// String immutability

// Basic logic

// 🔹 Example

// Input: "Java"
// Output: "avaJ"


public class question1 {

    public static void main(String[] args) {
        String str = "Java";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}