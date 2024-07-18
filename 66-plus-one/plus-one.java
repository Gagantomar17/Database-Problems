class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0 ;
        for(int i=digits.length-1 ; i>= 0 ; i-- ){
            if(i==digits.length-1){
              digits[i] = digits[i] + carry + 1  ;  
            }
            digits[i] = digits[i] + carry  ;
            if(digits[i] > 9){
                carry = 1 ;
                digits[i] = 0 ;

                if(i==0){
                int newDigits[] = new int[digits.length+1];
                newDigits[0] = carry ;
                for(int j=1 ; j<newDigits.length ; j++){
                    newDigits[j] = digits[j-1];
                }
                return newDigits ;
            }
            }else{
                return digits ;
            }
            
        }
        return digits ;
    }
}