package Sorting;

public class BubbleSorting {

    public static void bubbleSorting(int[] arr){

        int l = arr.length -1 ;
        while(l > 0){
            for(int i =0; i < l ; i++){
                if( arr[i] > arr[i+1]){
                    int temp =  arr[i];
                    arr[i] =  arr[i+1];
                    arr[i+1] = temp;
                }


            }
            l--;
        }

        for (int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{23,1,3,44,5,6,7,2,34,5,0};

        bubbleSorting(arr);
    }
}
