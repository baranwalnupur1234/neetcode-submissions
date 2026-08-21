class Solution {
    public boolean isAnagram(String s, String t) {
        char[]arr1=s.toCharArray();
        char[]arr2=t.toCharArray();
      if((arr1.length ==arr2.length) ){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      }

        return Arrays.equals(arr1,arr2);

    }
}
