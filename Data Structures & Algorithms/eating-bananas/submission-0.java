class Solution {

    private boolean canEatInTime(int[]piles, int h, int speed){

        int hours = 0;
        for(int pile : piles)
            hours+= (int)Math.ceil((double)pile/speed);
        return hours <=h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        // Find the piles size
        int maxSpeed = 0;
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed,pile);

            while(minSpeed < maxSpeed){
                int mid = (minSpeed + maxSpeed)/2;

                if(canEatInTime(piles, h, mid))
                maxSpeed = mid;
                else
                minSpeed = mid + 1;
                
            }
        }
        return minSpeed;
        
    }
}
