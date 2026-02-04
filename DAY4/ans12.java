import java.util.ArrayList;

public class ans12 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int r = 2;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=r;i<num.length;i++){
            list.add(num[i]);
        }
        for(int j=0;j<r;j++){
            list.add(num[j]);
        }

        System.out.println(list);
    }
}
