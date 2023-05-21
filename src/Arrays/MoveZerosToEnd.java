package Arrays;

public class MoveZerosToEnd {

    public static void moveZeroToEnd(int[] arr){
        for( int i  =0; i < arr.length; i++){
            if( arr[i] != 0){
                continue;
            }

            else{
                for(int j =i; j < arr.length; j++){
                    if(arr[j] != 0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }

        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,0,0,0,3,0,0,4,6,7,0,0,12};

        moveZeroToEnd(arr);
    }
}
