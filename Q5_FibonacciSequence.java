import java.util.*;
public class Q5_FibonacciSequence {
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        int fib = fibonacci(num-1)+fibonacci(num-2);
        return fib;
    } 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }

        sc.close();

    }
}
