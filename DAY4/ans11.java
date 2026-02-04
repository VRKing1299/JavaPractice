
public class ans11 {
    public static void main(String[] args) {
        String str = "java is powerfull";
        String[] arr = str.split(" ");
        // ArrayList<String> ls = new ArrayList<String> (Arrays.asList(arr));
        for (String word : arr){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            System.out.print(sb + " ");
        }
    }
}
