class Solution {

    public static void swap(int[] array , int j){
        while(j<array.length - 1){
            int temp = array[j] ;
            array[j] = array[j+1] ;
            array[j+1] = temp ;
            j++ ;
        }
    }

    public int removeDuplicates(int[] nums) {
        int uniqueIdx = 1 ;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[uniqueIdx] = nums[i] ; 
                uniqueIdx++ ;
            }
        }
        return uniqueIdx ;
    }
}