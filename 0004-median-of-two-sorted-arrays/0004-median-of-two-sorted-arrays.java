import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;
        double median = 0;
        int middle = 0;
        int [] merged = new int[length];
        //add the two arrays into one
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }
        //sort the combined array
        Arrays.sort(merged);
        //is it even?
        if (length%2 == 0){
            middle = length/2;
            median = (merged[middle] + merged [middle-1])/2.0;
        }else{ 
            //is it odd? take the middle value
            median = merged[length/2];
        }
        return median;
    }
}