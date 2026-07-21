class Solution {
    public int majorityElement(int[] nums) {
        int canditate = 0;
        int count = 0;

        for(int num:nums){
            if(count==0){
                canditate = num;
            }
            if(canditate == num){
                count++;
            }else {
                count--;
            }
        }
        return canditate;
    }
}
