public class Q7_FindMaxMin {
    public static int findMax(int[] num){
        int max=Integer.MIN_VALUE;
        int l=num.length;
        for(int i=0; i<l; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }

    public static int findMin(int[] num){
        int min= Integer.MAX_VALUE;
        int l= num.length;
        for(int i=0; i<l; i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[] arr= {4, 5, 9, 15, 8, 22};
        System.out.println("Max: "+findMax(arr));
        System.out.println("Min: "+findMin(arr));
    }
}
