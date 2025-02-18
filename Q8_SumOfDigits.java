
import java.util.Scanner;

public class Q8_SumOfDigits {
    public static int sum(int num){
        int result=0;
        while(num>0){
            result=result+(num%10);
            num = num/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(sum(n));

        sc.close();
    }
}
