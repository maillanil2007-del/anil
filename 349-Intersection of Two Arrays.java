import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store unique elements of nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Use a second HashSet to store the intersection
        // This ensures the result only contains unique elements
        Set<Integer> intersectSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectSet.add(num);
            }
        }
        
        // Convert the intersection set back to an array
        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (int num : intersectSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
