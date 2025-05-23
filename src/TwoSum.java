import java.sql.Array;
import java.util.HashMap;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap();
//        Integer[] ans = new Array;
        int[] ans = {};
        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(target - nums[i])){
                ans[0] = (int) map.get(target - nums[i]);
                ans[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}