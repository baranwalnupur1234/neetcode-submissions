class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]left = new int[nums.length];
        int[]right = new int[nums.length];
        int[]answer = new int[nums.length];

        // Left Product

        int product =1;
        for(int i=0;i<nums.length;i++){
            left[i]=product;
            product=product*nums[i];
        }
        //Right product
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            right[i]=product;
            product=product*nums[i];
        }
        //Left*Right

        for(int i=0;i<nums.length;i++){
            answer[i]=left[i]*right[i];
        }
        return answer;
    }
}  
