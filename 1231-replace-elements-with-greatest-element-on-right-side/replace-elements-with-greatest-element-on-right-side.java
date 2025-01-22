class Solution {
    public int[] replaceElements(int[] arr) {
         if(arr.length <= 1){
            return new int[]{-1};
        }
        int temp = arr[0];
        for(int i = 0; i < arr.length -1; i++){
            int min = Integer.MIN_VALUE;
            for(int j = i+1; j < arr.length; j++){
                if(min < arr[j]){
                    min = arr[j];
                }
            }
            arr[i] = min;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
