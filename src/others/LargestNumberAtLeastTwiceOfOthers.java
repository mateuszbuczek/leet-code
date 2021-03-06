package others;

//In a given integer array nums, there is always exactly one largest element.
//
//        Find whether the largest element in the array is at least twice as much as every other number in the array.
//
//        If it is, return the index of the largest element, otherwise return -1.
//
//        Example 1:
//
//        Input: nums = [3, 6, 1, 0]
//        Output: 1
//        Explanation: 6 is the largest integer, and for every other number in the array x,
//        6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
//
//
//        Example 2:
//
//        Input: nums = [1, 2, 3, 4]
//        Output: -1
//        Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.

public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {
       if(nums == null || nums.length < 2) return 0;
       int first = 0;
       int sec = 0;
       int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > first) {
                sec = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > sec) {
                sec = nums[i];
            }
        }
        if(2 * sec <= first) return index;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {0,0,2,3}));
    }
}
