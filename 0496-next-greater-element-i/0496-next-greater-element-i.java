class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int n = nums2.length;

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = -1;

            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {

                    int x = j;

                    while (x < n) {
                        if (nums2[x] > nums1[i]) {
                            arr[i] = nums2[x];
                            break;
                        }
                        x++;
                    }

                    break;
                }
            }
        }

        return arr;
    }
}