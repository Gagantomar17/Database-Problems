class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>() ;
        for(int i=0 ; i<nums.length ; i++){
            int j = Math.abs(nums[i]) - 1;
            if(nums[j] > 0){
                nums[j] *= -1 ;
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>0){
                l.add(i+1);
            }
        }
        return l ;
    }
}