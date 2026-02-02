public class ans9 {
    public static void main(String[] args) {
        boolean anagram = true;
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length()==str2.length()) {
            for(int i=0 ;i<str1.length();i++){
                if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                    anagram=false;
                    break;
                }
            }
        }
        else{
            anagram=false;
        }
        if (anagram) {
            System.out.println("string is anagram");
        }else{
            System.out.println("string is not anagram");
        }
    }
}
