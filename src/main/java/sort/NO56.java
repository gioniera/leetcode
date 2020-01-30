package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: WYL
 * @create: 2020-01-30 11:47
 * 合并区间
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6]
 **/
public class NO56 {
    /**
     * 先将输入的数组按左边数字排序 再判断相邻是否有重叠 重叠合并
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if (intervals.length==0){
            return new int[0][];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        List<int[]> out = new ArrayList<>();
        int [] current = intervals[0];
        for (int i = 1; i<intervals.length; i++){
            if (isOverlap(current,intervals[i])){
                current = merge(current,intervals[i]);
            }
            else {
                out.add(current);
                current = intervals[i];
            }
        }
        out.add(current);
        int [][] ans = new int[out.size()][2];
        for (int i = 0; i<out.size(); i++){
            ans[i]=out.get(i);
        }
        return ans;
    }

    public boolean isOverlap(int [] in1, int [] in2){
        if (in1[1]>=in2[0]){
            return true;
        }
        return false;
    }

    public int[] merge(int[] in1, int[] in2){
        int [] ans = new int[2];
        ans[0] = Math.min(in1[0],in2[0]);
        ans[1] = Math.max(in1[1],in2[1]);
        return ans;
    }
}
