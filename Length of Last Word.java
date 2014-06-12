public class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordarray;
        wordarray = s.split(" ");
        if(wordarray.length==0) return 0;
        return wordarray[wordarray.length-1].length();
    }
}
