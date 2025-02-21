public class Q15_GCD_LCM {
    public static int getGCD1(int a, int b){
        // call the gcd() method recursively by 
        // replacing a with b and b with 
        // modulus(a,b) as long as b != 0
        if (b == 0){
            return a; 
        }
        else{
            return getGCD1(b, a % b);
        }      
    }

    public static int getGCD2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //Math.abs(), to handle -ve values.
    public static int getLCM(int a, int b) {
        return Math.abs(a * b) / getGCD1(a, b);
    }

    public static void main(String[] args) {
        int a=36, b=48;
        System.out.println("GCD: "+getGCD1(a, b));
        System.out.println("LCM: "+getLCM(a, b));
    }
}