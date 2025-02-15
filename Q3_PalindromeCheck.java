import java.util.Scanner;

public class Q3_PalindromeCheck {
    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        String rev = "";
        for(int i=str.length()-1; i>=0;i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPalindrome(int num){
        int n = num;
        int rev=0;

        while(n>0){
            rev = (rev*10) + n%10;
            n/=10;  
        } 

        return num == rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(isPalindrome(num));

        System.out.println("Enter a String:");
        String str=sc.next();
        System.out.println(isPalindrome(str));

        sc.close();
    }
}
