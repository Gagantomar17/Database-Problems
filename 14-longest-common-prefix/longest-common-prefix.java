class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder str = new StringBuilder() ;
        Boolean match = false ;
        int j=0 ;
        for(int i=0 ; i<strs[0].length() ; i++){
            for(j=0 ; j<strs.length-1 ; j++){
                if( i >= strs[j].length() || i >= strs[j+1].length() || 
                strs[j].charAt(i) != strs[j+1].charAt(i) ){
                    return str.toString() ;
                }
            }
            str.append(strs[j].charAt(i)) ;
        }
        return str.toString() ;
    }
}