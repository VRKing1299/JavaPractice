import java.util.Scanner;

public class ans2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.print(num + " : ");
        boolean isPrime = true;

        if (num<=1) {
            isPrime=false;
        }else if (num == 2) {
            isPrime=true;
        }else{
            for(int i =2 ; i<= num/2 ; i++){
                if (num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(" number is a prime number");
        }else{
            System.out.println(" number is not a prime number");
        }


    }
}
