import java.util.ArrayList;
import java.util.List;
public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0)
            return 0;
        int p = 0;
        for(int q = 1;q<length;q++) {
            if(nums[p] != nums[q]) {
                p++;
                nums[p] = nums[q];
            }
        }
        return p+1;
    }
}