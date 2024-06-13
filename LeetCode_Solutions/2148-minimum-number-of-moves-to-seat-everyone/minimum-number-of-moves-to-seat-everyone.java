class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
       Arrays.sort(students);
       int sum=0;
       for(int i=0;i<students.length;i++){
        sum+=Math.abs(students[i]-seats[i]);
       } 
       return sum;
    }
}