import java.util.*;
public class Q4_Factorial {

    public static int factorial(int n){
        
        if(n==1 || n==0){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));

        sc.close();
    }
}