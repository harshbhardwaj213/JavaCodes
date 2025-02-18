import java.util.*;
public class Q6_ReverseString {
    public static void reverseString(String str){
        int n=str.length();
        String rev="";
        for(int i=n-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s=sc.nextLine();
        reverseString(s);

        sc.close();
    }
}
