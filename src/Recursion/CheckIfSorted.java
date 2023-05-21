package Recursion;

public class CheckIfSorted {

    public static int ifArrayIsSorted(int[] arr, int index){

        if(arr.length == 1){
            return 1;
        }
        else if(index == 1){
            return arr[0] < arr[1] ?1 : 0;
        }

        else{
            return arr[index-2] > arr[index-1]? 0 : ifArrayIsSorted(arr, index--);
        }
    }

    public static void main(String[] args){
        int[] arr  =  new int[]{1,3,4,6,8,10,14};

        System.out.println(ifArrayIsSorted(arr, arr.length));

    }

}
