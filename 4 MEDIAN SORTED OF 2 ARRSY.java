class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int k = n + m ;
        int merge[] = new int[k];

       int l1=0; // determining nums1  array length 
       int l2 = 0; // determining filling of nums2 array
        for(int i=0;i<k;i++) {
            if(l1 != n) {
                merge[i] =  nums1[i];
                l1++;
            } else {
                merge[i] = nums2[l2];
                l2++;
            }
        }  

        Arrays.sort(merge);

       int mid = merge.length / 2;
        
        if(merge.length % 2 != 0) {
            return merge[merge.length / 2];
        }  else {
            double ans = merge[mid] + merge[mid - 1];
            return ans/2;
        }
    }
}