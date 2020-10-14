/**
 * Given two arrays, write a function to compute their intersection.
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length < 1 || nums2.length < 1) return new int[0];

        List<Integer> intersection = new ArrayList<>();
        int endPointer = nums2.length - 1;

        for (int p1 = 0; p1 < nums1.length; p1++) {
            if (endPointer < 0) break;

            for (int p2 = 0; p2 <= endPointer; p2++) {
                if (nums2[p2] == nums1[p1]) {
                    intersection.add(nums1[p1]);
                    nums2[p2] = nums2[endPointer--];
                    break;
                }
            }
        }
        int outputSize = intersection.size();
        if (outputSize == 0) return new int[0];

        int[] output = new int[outputSize];
        Iterator<Integer> iterator = intersection.iterator();
        for (int i = 0; i < outputSize; i++) {
            output[i] = iterator.next();
        }
        return output;
    }
}