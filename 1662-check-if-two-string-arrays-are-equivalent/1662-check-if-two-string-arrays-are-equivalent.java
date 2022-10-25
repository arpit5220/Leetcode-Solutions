class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        // METHOD 1 0(N) SPACE
//         StringBuilder str1=new StringBuilder();
//         for(int i=0;i<word1.length;i++)
//         {
//             str1.append(word1[i]);
//         }
        
//         StringBuilder str2=new StringBuilder();
//         for(int i=0;i<word2.length;i++)
//         {
//             str2.append(word2[i]);
//         }
//        // return str1.toString().equals(str2.toString());
        
//         if(str1.toString().equals(str2.toString()))
//             return true;
//         else
//             return false;
        
        
        
        /// METHOD 2 0(1) SPACE   /// DO SOLVE THIS AND UNDERSTAND
        
        int idx1 = 0, idx2 = 0, arrIdx1 = 0, arrIdx2 = 0;
        while (arrIdx1 < word1.length && arrIdx2 < word2.length) {
            if (word1[arrIdx1].charAt(idx1) != word2[arrIdx2].charAt(idx2)) return false;
            if (idx1 == word1[arrIdx1].length() - 1) {
                idx1 = 0;
                arrIdx1++;
            } else idx1++;
            if (idx2 == word2[arrIdx2].length() - 1) {
                idx2 = 0;
                arrIdx2++;
            } else idx2++;
        }
        return (arrIdx1 == word1.length && arrIdx2 == word2.length);
        
        
    }
}