import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each element in nums
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list of entries and sort them by frequency (value)
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mp.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort in descending order of frequency

        // Step 3: Collect the top k frequent elements
        List<Integer> lt = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            lt.add(entryList.get(i).getKey()); // Add the key (element) to the list
        }

        // Step 4: Convert the list to an array
        int[] ans = new int[lt.size()];
        for (int i = 0; i < lt.size(); i++) {
            ans[i] = lt.get(i);
        }

        return ans;
    }
}
