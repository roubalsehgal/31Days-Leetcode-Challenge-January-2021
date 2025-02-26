class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map =new HashMap<>();
        int count =0;
        for(int el: nums){
            if(map.containsKey(k- el)){
                int freq = map.get(k- el);
                if(freq ==1){
                    map.remove(k-el);

                } else {
                    map.put(k-el, freq-1);
                }
                count++;
            } else{
                map.put(el, map.getOrDefault(el, 0)+1);
            }
        }
        return count;
    }
}
