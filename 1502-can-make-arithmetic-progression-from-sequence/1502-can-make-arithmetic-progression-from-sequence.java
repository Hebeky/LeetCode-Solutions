import java.util.Arrays;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[0] - arr[1];
        int spotter = 0;
        for(int i = 0; i < arr.length-1; i ++){
            spotter = arr[i] - arr[i+1];
            if(spotter!=difference){
                return false;
            }
        }
        return true;
    }
}