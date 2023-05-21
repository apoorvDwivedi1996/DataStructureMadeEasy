package Sorting;

public class SelectionSorting {

    public static void sort(int[] arr){

        for( int i =0; i < arr.length; i++){
            int min = arr[i];
            int count = -1;
            for ( int j =i ; j < arr.length; j++){
                if( arr[j] < min ){
                    min = arr[j];
                    count =j;
                }
            }
            if( count != -1){
                int temp = arr[i];
                arr[i] = min;
                arr[count] = temp;
            }
        }

        for( int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{ 1,4,2,67,34,23,44,87,10,2};
        sort(arr);
    }
}
