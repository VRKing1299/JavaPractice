package DAY05;

public class ans14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        for (int i =0; i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
