package com.snail.algoprac;

/**
 * 二分查找实现类
 * 二分查找分析：
 * 解决的问题:在一对有序的数据中采用将数据二分的方式快速的查找某一条数据
 * 特点：数据有序
 * 实现条件：1>数据集 2>待查数据
 * 缺点：只能够确定这个数据有没有，不能确定有多少个。如果查找的数据有重复出现，返回的index不是第一个数据出现的index
 * 优点：逐步缩小范围，可以在海量数据中找到这条数据存不存在，对于数据集中每条数据都不重复来说效果不错
 *
 * @author yongjie on 2017/11/25.
 */

public class BinarySearch {
    /**
     * 二分查找第一种实现：递归
     *
     * @param dataSet int数组来作为数据集合（注意输入的数据必须是有序的）
     * @param aim     带查找的目标值
     * @return 返回目标值index。没有查找到返回-1
     */
    public static int searchOne(int[] dataSet, int aim) {
        return searchOne(dataSet, aim, 0, dataSet.length - 1);
    }

    private static int searchOne(int[] dataSet, int aim, int l, int h) {
        //参数基本校验 dataSet没有数据、一条数据、n条数据
        if (l > h) {
            return -1;
        }
        int mid = (h - l) / 2 + l;
        if (aim < dataSet[mid]) {
            //既然小于 mid这个值已经比较过了，所以此时查找的小标范围就是[l,mid-1]
            return searchOne(dataSet, aim, l, mid - 1);
        } else if (aim > dataSet[mid]) {
            //同理
            return searchOne(dataSet, aim, mid + 1, h);
        } else {
            return mid;
        }
    }
}
