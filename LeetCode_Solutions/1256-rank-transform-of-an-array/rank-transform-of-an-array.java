class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length<1){
            return arr;
        }
        int count =1;
        int[] arr1=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
       Map<Integer,Integer>mp=new HashMap<>();
       mp.put(arr1[0],1);
        for(int i=1;i<arr1.length;i++){
            if(mp.containsKey(arr1[i])){
                continue;
            }
            else{
                count=count+1;
                mp.put(arr1[i],count);
            }
        }
      //  System.out.println(mp);
        for(int i=0;i<arr1.length;i++){
                arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}