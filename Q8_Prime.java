import java.util.*;
public class Q8_Prime {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();  
            System.out.println(isPrime(n));  
        } catch (Exception e) {
            // Handle invalid input (e.g., if the user enters a non-integer)
            System.out.println("Invalid input! Please enter an integer.");
        }
        
    }
}
