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
        // alternative understandable approach:
        /*
         * class Solution {
         * public int mostFrequentElement(int[] nums) {
         * int n=nums.length;
         * int len=0;
         * //find the max element in array
         * for(int i=0;i<n;i++){
         * len=Math.max(nums[i],len);
         * }
         * //create hash array and store the value
         * int[] hash=new int[len+1];
         * for(int i=0;i<n;i++){
         * hash[nums[i]]++;
         * }
         * //compare
         * int max=0;
         * int el=0;
         * for(int i=0;i<hash.length;i++){
         * if(hash[i]>max){
         * max=hash[i];
         * el=i;
         * }
         * else if(hash[i]==max){
         * el=Math.min(el,i);
         * }
         * }
         * return el;
         * }
         * }
         * 
         * 
         * 
         */
    }
}
