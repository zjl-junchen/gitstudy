import java.util.HashMap;
import java.util.Map;

public class 只出现一次的数136 {
    /**
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     *
     * Note:
     *
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     *
     * Example 1:
     *
     * Input: [2,2,1]
     * Output: 1
     * Example 2:
     *
     * Input: [4,1,2,1,2]
     * Output: 4
     *
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 说明：
     *
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     *
     * 示例 1:
     *
     * 输入: [2,2,1]
     * 输出: 1
     * 示例 2:
     *
     * 输入: [4,1,2,1,2]
     * 输出: 4
     */

    public static void main(String[] args) {
        int[] nums ={2,2,1,1,4};
        System.out.println(singleNumber2(nums));
    }

    /**
     * 异或不好理解
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
            System.out.println("res="+res+", nums[i]="+ nums[i]);
        }
        return res;
    }

    /**
     * 效率低下
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],0);
            }
        }

        for (Integer s : map.keySet()){
           if(map.get(s) == 0){
                return s;
           }
        }
        return 0;
    }
}
