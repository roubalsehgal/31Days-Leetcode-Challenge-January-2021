class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int index = 0, i = 0, first = 0, track = 0;
        
        while(track!=nums.length){
            if(i==0 && nums[track]==1){
                first = track;
                i=1;
                index = track;
            }
            if(track!=0 && nums[track]==1 && track!=index){
                if((track - index) <= k){
                    return false;
                }
                index = track;
            }
            track++;
        }
        return true;
    }
}
