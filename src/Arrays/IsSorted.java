package Arrays;

public class IsSorted {

    public static  void isSorted(int[] arr){

        int count = 0;
        for( int i =0; i< arr.length -1; i++){

            if(arr[i] > arr[i+1]){
                System.out.println(" Array is not sorted");
                count = 1;
                break;
            }

            else
                continue;
        }

        if(count != 1){
            System.out.println(" Array is sorted");
        }


    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,3};
        isSorted(arr);
    }


}
