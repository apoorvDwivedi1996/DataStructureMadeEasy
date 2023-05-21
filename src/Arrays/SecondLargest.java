package Arrays;

public class SecondLargest {

    public static void secondLargest(int[] arr){

        int max= 0;
        int secMax = -1;
        for(int i =0; i < arr.length; i++){

            if(arr[i] > max){
                secMax = max;
                max = arr[i];
                continue;
            }

            if(arr[i] > secMax){
                secMax = arr[i];
                continue;
            }

            continue;

        }
        System.out.println(secMax);
    }

    public static void main(String[] args){

        int[] arr = new int[]{1,6,65,2,6,8,60,0};

        secondLargest(arr);
    }

}
