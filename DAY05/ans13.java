package DAY05;

import java.util.LinkedHashMap;
import java.util.Map;

public class ans13 {

    public static void main(String[] args) {
        String str = "aaabbc";

        Map <Character,Integer> set = new LinkedHashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){
            if (set.containsKey(str.charAt(i))) {
                int count = set.get(str.charAt(i));
                set.put(str.charAt(i), count + 1);
            } else {
                set.put(str.charAt(i), 1);
            }
        }

        System.out.println(set);

    }
}