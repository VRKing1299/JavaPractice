import java.util.ArrayList;
import java.util.Arrays;

public class ans8 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 0, 7};
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }else{
                al.add(arr[i]);
            }
        }
        for(int j=0;j<count;j++){
            al.add(0);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(al);
    }
}
