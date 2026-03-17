package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindCount {
    public Map<String, Integer> findAndCount(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {

            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        return map;
    }

    ;
}
