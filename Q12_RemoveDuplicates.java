
import java.util.LinkedHashSet;

public class Q12_RemoveDuplicates {
    public static void remove(int[] arr){
        LinkedHashSet <Integer> set = new LinkedHashSet<>();

        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 1, 4, 4, 8, 2, 5, 6, 9};
        remove(arr);
    }
}
