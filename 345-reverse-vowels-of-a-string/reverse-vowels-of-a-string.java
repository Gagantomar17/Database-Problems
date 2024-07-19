class Solution {

    static void swap(char[] arr , int i , int j){
        char temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public String reverseVowels(String s) {
        char[] word = s.toCharArray() ;
        int i=0 ;
        int j=s.length() -1 ;
        String vowels = "aeiouAEIOU" ;
        while(i<j){
            while(i<j && vowels.indexOf(word[i])==-1){
                i++;
            }
            while(i<j && vowels.indexOf(word[j]) == -1){
                j--;
            }
            swap(word , i , j);
            i++;
            j--;
        }
        String ans = new String(word);
        return ans ;
        

    }
}