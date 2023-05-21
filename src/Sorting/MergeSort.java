package Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr,int low,int high){


        int mid = (low + high)/2;

        if(low == mid || mid+1 == high){
            return;
        }

        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid,int high){

        int i = low;
        int j = mid+1;
        int k =0;
        int[] temp = new int[high+1];

        while(i < mid+1 || j <= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else if(arr[j] < arr[i]){
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        for(int a =0; a< k; j++){
            arr[a] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{23,1,3,44,5,6,7,2,34,5,0};
        int low =0;
        int high = arr.length -1;
        mergeSort(arr, low, high);
    }
}
