package LeetCode;

import java.util.*;

public class FindAllDuplicatesinanArray {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] x = {4, 3, 2, 7, 8, 2, 3, 1};
//        List<Integer> r = findDuplicates(x);
//        for (int e : r) System.out.print(e + " ");
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(new TreeNode(1));
        System.out.println(queue.size());
        List<Integer> wrapList = new LinkedList<>();
        wrapList.add(0,1);
    }



}
