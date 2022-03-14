package main.medium;

import java.util.Arrays;

public class FindtheKthLargestIntegerintheArray_1985 {



    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (o1, o2) -> {
            int l1 = o1.length(),
                l2 = o2.length();
            if (l1 != l2) {
                return l1 - l2;
            }
            return o1.compareTo(o2);
        });
        return nums[nums.length - k];
    }
}