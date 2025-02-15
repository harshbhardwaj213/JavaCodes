public class Q2_BubbleSort {
    public static void sortNums(int[] nums){
        for(int turn=0; turn<nums.length; turn++){
            for(int j=0; j<nums.length-1-turn; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }

    public static void sortChars(char[] charArray){
        for(int turn=0; turn<charArray.length; turn++){
            for(int j=0; j<charArray.length-1-turn; j++){
                if(charArray[j]>charArray[j+1]){
                    char temp=charArray[j+1];
                    charArray[j+1]=charArray[j];
                    charArray[j]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr={5,9,2,4,1};
        sortNums(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        char[] arr2={'b', 'd', 'a', 'e'};
        sortChars(arr2);
        for(int i=0; i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
