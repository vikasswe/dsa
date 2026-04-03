package gfg;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {-5, 3, -5};
        int n = arr.length;
        int limit = n/3;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(int key: hashMap.keySet()){
            if(hashMap.get(key) > limit){
                list.add(key);
            }
        }

        Collections.sort(list);

        System.out.println(list);

    }

}
