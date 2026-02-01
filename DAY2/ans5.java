class ans5{
    public static void main(String[] args) {
        int[] arr = {10, 45, 3, 99, 23};
        int num1 =0 ;
        int num2 = arr[0];

        for (int i = 0;i<arr.length;i++){
            if((num1<arr[i])  ){
                num2=num1;
                num1=arr[i];
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}