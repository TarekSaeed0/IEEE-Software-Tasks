class Solution {
  public String longestCommonPrefix(String[] strs) {
    int maximumPrefixLength = strs[0].length();
    for (String str : strs) {
      maximumPrefixLength = Math.min(maximumPrefixLength, str.length());
    }

    int prefixLength;
    for (prefixLength = 0; prefixLength < maximumPrefixLength; prefixLength++) {
      boolean allEqual = true;
      char c = strs[0].charAt(prefixLength);
      for (String str : strs) {
        if (str.charAt(prefixLength) != c) {
          allEqual = false;
          break;
        }
      }
      if (!allEqual) {
        break;
      }
    }

    return strs[0].substring(0, prefixLength);
  }
}