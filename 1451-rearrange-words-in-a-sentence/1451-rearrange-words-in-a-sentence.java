class Solution {
     public static String arrangeWords(String text) {
    String[] s = text.split(" ");
    Arrays.sort(s, (s1, s2) -> {
      return s1.length() - s2.length();
    });
    StringBuilder v = new StringBuilder();
    for (String value : s) {
      v.append(" ").append(value.toLowerCase());
    }
    char[] ans = v.substring(1).toCharArray();// remove space from front
    ans[0] = (char) (ans[0] + 'A' - 'a');//change uppercase
    return new String(ans);
  }

}