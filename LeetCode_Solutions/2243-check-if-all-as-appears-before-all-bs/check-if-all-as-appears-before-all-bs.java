class Solution {
    public boolean checkString(String s) {
        char arr [] = s.toCharArray();
        char brr[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(brr);
        return Arrays.equals(arr,brr); 
    }
}