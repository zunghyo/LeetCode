class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length/3;
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if(entry.getValue() > threshold) result.add(entry.getKey());
        }
        
        return result;
    }
}