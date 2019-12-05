package eazy;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 双指针法 从最后一位开始比较 谁大放最后
 * @author: WYL
 * @create: 2019-12-04 19:30
 **/
public class NO88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i>=0||j>=0){
            if (i<0){
                nums1[k] = nums2[j];
                j--;
                k--;
            }else if (j<0){
                nums1[k]=nums1[i];
                i--;
                k--;
            } else if (nums2[j]>=nums1[i]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }else if (nums2[j]<nums1[i]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        NO88 no = new NO88();
        no.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
