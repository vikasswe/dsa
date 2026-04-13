package TwoPointersSliding;

public class PairTargetSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;

            int count = 0;

            while(left<right){

                int sum = arr[left] + arr[right];

                if(sum<target){
                    count = count+(right-left);
                    left++;
                }else{
                    right --;
                }
            }
        System.out.println(count);
    }
}
