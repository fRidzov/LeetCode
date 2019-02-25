package com.company.tasks;

public class _1_two_sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (i != j && nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return new int[]{};
    }

    public static String output(int[] array) {
        StringBuilder s = new StringBuilder();
        for (int it : array) {
            s.append(it).append(" ");
        }
        return s.toString();
    }
}
