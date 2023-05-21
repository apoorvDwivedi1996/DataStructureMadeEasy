package Sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int l = arr.length;

        for( int i =1; i<l;i++ ){
            for( int j =i ; j >0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] =  arr[j-1];
                    arr[j-1] = temp;

                }
                else
                    break;
            }
        }

        for( int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{33,24,30,22,5,9,20,13,31,20,16};

        insertionSort(arr);
    }


}
