class solution7 {
    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;
            boolean alreadyCounted = false;

            // check if this character was already processed
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == current) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // count frequency
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }

            System.out.println(current + " -> " + count);
        }
    }
}
