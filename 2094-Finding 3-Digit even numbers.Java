import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // Count frequencies of each digit (0-9)
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        // Iterate through all possible 3-digit even numbers (100 to 998)
        for (int i = 100; i <= 998; i += 2) {
            int hundred = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;

            // Check if the current number can be formed using the given digits
            freq[hundred]--;
            freq[ten]--;
            freq[one]--;

            if (freq[hundred] >= 0 && freq[ten] >= 0 && freq[one] >= 0) {
                result.add(i);
            }

            // Restore counts for the next iteration
            freq[hundred]++;
            freq[ten]++;
            freq[one]++;
        }

        // Convert List to int[] array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
