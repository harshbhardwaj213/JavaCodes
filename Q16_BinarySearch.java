public class Q16_BinarySearch {
    public static int findKey(int[] arr, int key, int si, int ei){
        
        if(si>ei){
            return -1; //Key Not Found.
        }

        int mid=(si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(key>arr[mid]){
            return findKey(arr, key, mid+1, ei);
        }
        else{
            return findKey(arr, key, si, mid-1);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,5,8,9,10,15};
        int key=10;
        int si=0, ei=arr.length-1;
        System.out.println("Index for key is: "+findKey(arr, key, si, ei));
    }
}
