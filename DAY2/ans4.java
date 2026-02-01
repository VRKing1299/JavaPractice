public class ans4 {
    public static void main(String[] args) {
        String str = "Interview";
        str = str.toLowerCase();
        char[] v = {'a','e','i','o','u'};
        int count = 0;

        for (int i = 0; i<str.length();i++){
            for(int j = 0; j<v.length;j++){
                if (str.charAt(i)==v[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}


        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = 0; j < v.length; j++) {
        //         if (String.valueOf(str.charAt(i)).toLowerCase().equals(String.valueOf(v[j]))) {
        //             count++;
        //         }
        //     }
        // }
