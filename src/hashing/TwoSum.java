package hashing;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] intArray = {1, 1, 1, 1};
        int target = 2;

        int result = countPairs(intArray, target);

        System.out.println(result);

    }

    public static int countPairs(int arr[], int target) {

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< arr.length; i++){

            System.out.println("Inside map ====> " + map.toString());

            int currNum = arr[i];

            int reqNum = target - currNum;

            System.out.println("req =======> " + reqNum);

            if(map.containsKey(reqNum)){
                System.out.println("Find =======> " + reqNum);

                int frequency = map.get(reqNum);

                count = count + frequency;
            }

            if(map.containsKey(currNum)){
                int frequency = map.get(currNum);

                map.put(currNum, frequency+1);

            }else{
                map.put(currNum, 1);
            }
        }

        return count;
    }

    public static int[] twoSum(int[] arr, int target) {

        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int currentNum = arr[i];
            int requiredNum = target - currentNum;

            if (map.containsKey(requiredNum)) {
                int firstIndex = map.get(requiredNum);
                int secondIndex = i;

                result[0] = firstIndex;
                result[1] = secondIndex;

                break;
            }

            map.put(arr[i], i);
        }

        return result;
    }

}
