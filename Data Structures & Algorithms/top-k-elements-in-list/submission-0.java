
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Long>hm= Arrays.stream(nums).boxed().collect(Collectors.groupingBy(java.util.function.Function.identity(),Collectors.counting()));

      return  hm.entrySet().stream().sorted((a,b)->Long.compare(b.getValue(),a.getValue()))
       .limit(k)
       .mapToInt(e->e.getKey())
       .toArray();
        
    }
}
