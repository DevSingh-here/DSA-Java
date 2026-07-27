class Solution {
    public int mostFrequentElement(int[] nums) {
        int n = nums.length;
        int maxfreq = 0;
        int el = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();
            if (freq > maxfreq) {
                maxfreq = freq;
                el = ele;
            } else if (freq == maxfreq) {
                el = Math.min(el, ele);
            }
        }
        return el;
    }
}
