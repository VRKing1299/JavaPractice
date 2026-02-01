public class ans6 {
    public static void main(String[] args) {
        String str="madam";
        boolean palindrome = true;
        int j = str.length()-1;
        for(int i = 0; i<str.length();i++){
            if (str.charAt(i)!=str.charAt(j)) {
                System.out.println(j);
                palindrome =false;
                break;
            }
            
            // System.out.println(str.charAt(i));
            // System.out.println(str.charAt(j));
            // System.out.println(palindrome);
            // System.out.println("=====================================================");
            j--;
        }

        if (palindrome) {
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

        System.out.println(str.length());
    }
}
