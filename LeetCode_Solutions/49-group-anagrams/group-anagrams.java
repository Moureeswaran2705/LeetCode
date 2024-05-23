class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> keyToAnagrams = new HashMap<>();

    for (final String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = String.valueOf(chars);
      //System.out.println(key);
      keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
      //System.out.println(keyToAnagrams);
    }

    return new ArrayList<>(keyToAnagrams.values());
  }
}