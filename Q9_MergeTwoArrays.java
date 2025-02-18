public class Q9_MergeTwoArrays {
    public static void merge(int[] arr1, int[] arr2){
        int l1=arr1.length, l2=arr2.length;

        int[] mergedArray= new int[l1+l2];
        int i=0, j=0, k=0;
        
        while(i<l1 && j<l2){
            if(arr1[i]<arr2[j]){
                mergedArray[k]=arr1[i];
                i++;
                k++;
            }
            else{
                mergedArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            mergedArray[k++]=arr1[i++];
        }
        while (j<l2) {
            mergedArray[k++]=arr2[j++];
        }

        for(int l=0;l<mergedArray.length;l++){
            System.out.print(mergedArray[l]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1={2,4,5,6};
        int[] arr2={1,3,7,8};
        merge(arr1, arr2);
    }
}
