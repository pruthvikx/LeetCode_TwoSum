package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,3}, 6)));
        System.out.println(solution.getLength(new int[]{1}));
    }
}