package Arrays;

public class RemoveDuplicate {

    public static int[] shiftElement(int[] arr, int index){
        for(int i =index; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        int[] newArr = new int[arr.length -1];
        for(int i = 0; i <newArr.length;i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static void checkDuplicate(int[] arr){
        int count = 0;
        int i = 0;
        for(i =0; i< arr.length-1; i++){

            if(arr[i] ==  arr[i+1]){
                break;
            }
            count++;
        }
        if(count == arr.length-1){
            printArray(arr);
        }
        else {
            checkDuplicate(shiftElement(arr, i));
        }
    }

    public static void printArray(int[] arr){
        for(int i =0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        checkDuplicate(arr);
    }
}
