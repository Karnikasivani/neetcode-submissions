class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        LinkedHashMap<Integer, Integer> sorted =
            freq.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                    Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        List<Integer> sortedEle = new ArrayList<>(sorted.keySet());
        // System.out.println(list);
        for(int i=0;i<k;i++) list.add(sortedEle.get(i));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

