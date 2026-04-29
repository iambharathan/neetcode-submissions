class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //sort HashMap
        //create a datatype to sort
        PriorityQueue<Map.Entry<Integer,Integer>> heap= new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        //add values to heap
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            heap.add(entry);
            if(heap.size() > k){
                heap.poll();
            }
        }
        //extract result
        int[] result = new int[k];
        for(int i = k-1; i>=0; i--){
            result[i] = heap.poll().getKey();
        }
        return result;
    }
}
