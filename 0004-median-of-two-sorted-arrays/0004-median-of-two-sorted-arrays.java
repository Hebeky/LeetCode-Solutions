import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;
        double median = 0;
        int middle = 0;
        int [] merged = new int[length];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }
        Arrays.sort(merged);
        if (length%2 == 0){
            middle = length/2;
            median = (merged[middle] + merged [middle-1])/2.0;
        }else{
            median = merged[length/2];
        }
        return median;
    }
}