package hashing;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] intArray = {2, 7, 11, 15};
        int target = 9;

        int [] arr = twoSum(intArray, target);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] arr, int target) {

        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int currentNum = arr[i];
            int requiredNum = target - currentNum;

            if(map.containsKey(requiredNum)){
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
