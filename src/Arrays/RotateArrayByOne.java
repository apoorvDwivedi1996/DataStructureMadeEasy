package Arrays;

public class RotateArrayByOne {

    public static void rotateByOne(int[] arr){
        int temp = arr[0];
        for(int i =1; i < arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;


    }

    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void rotateArrayByN(int[] arr, int n){

        while(n > 0){
            rotateByOne(arr);
            n--;
        }

        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        rotateArrayByN(arr,5);
    }
}
