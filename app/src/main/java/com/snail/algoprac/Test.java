package com.snail.algoprac;

import java.util.Arrays;

/**
 * @author yongjie on 2017/11/25.
 */

public class Test {


    public static void main(String[] args) {
        int[] dataSet = new int[]{1, 23, 53, 123, 513, 51, 231, 515, 14, 3, 14, 112, 41, 4, 1, 12, 44, 1, 31, 3};
        Arrays.sort(dataSet);
        int result = BinarySearch.searchOne(dataSet, 1);
        System.out.println(result);
    }
}
