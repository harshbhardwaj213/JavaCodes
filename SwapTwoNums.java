public class SwapTwoNums {
    public static void swap(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("X: " +x+ "\nY: "+y);
    }
    public static void main(String[] args) {
        int x=10, y=15;
        swap(x, y);
    }
}