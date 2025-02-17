import java.util.*;
public class Q5_FibonacciSequence {
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        int fib = fibonacci(num-1)+fibonacci(num-2);
        return fib;
    } 

    public static void iterativeFib(int num){
        int num1=0, num2=1;
        for(int i=0; i<num;i++){
            System.out.print(num1+" ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }

        System.out.println("\nEnter a Number");
        int m=sc.nextInt();
        iterativeFib(m);

        sc.close();
    }
}