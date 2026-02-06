package DAY05;

public class ans15 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        // int largest = arr[0];
        boolean sorted = true;

        for(int i = 0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    sorted=false;
                    break;
                }
            }
        }

        System.out.println(sorted?"sorted":"not sorted");

    }
}
