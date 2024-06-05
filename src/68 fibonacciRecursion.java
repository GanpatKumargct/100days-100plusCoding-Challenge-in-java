import java.util.Scanner;

class fibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position){
        if(position == 1){
            return 0;
        }else if (position == 2){
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position-2);
    }
}