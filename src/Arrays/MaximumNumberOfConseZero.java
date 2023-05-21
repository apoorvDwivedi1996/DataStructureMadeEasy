package Arrays;

public class MaximumNumberOfConseZero {

    public static void findFreq(int[] arr){
        int max=0;
        int count= 0;
        for(int i =0; i < arr.length; i++){


            if(arr[i]== 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else if(count > max){
                    max = count;
                    count = 0;
                }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        findFreq(arr);
    }
}
