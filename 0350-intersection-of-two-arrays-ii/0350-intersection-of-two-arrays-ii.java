import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // put in hashMap v
        // get in hashMap, decrease amount
    
        Map<Integer, Integer> maps = new HashMap<>();
        
        for (int i=0; i<nums1.length; i++) {
            maps.put(nums1[i], maps.getOrDefault(nums1[i], 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i=0; i<nums2.length; i++) {
            if (maps.get(nums2[i]) == null) {
                continue;
            }
            if (maps.get(nums2[i]) != 0) {
                maps.put(nums2[i], maps.get(nums2[i]) - 1);
                result.add(nums2[i]);
            }
        }
        int[] r = new int[result.size()];
        
        for (int i=0; i<result.size(); i++) {
            r[i] = result.get(i);
        }

        
        return r;
        
    }
}