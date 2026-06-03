package Array_Problem_3;

public class missing {
        public int missingNumber(int[] nums) {
            int sum = 0;
            int idx = 0;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                idx += i;
            }
            idx += nums.length;
            return idx - sum;
        }
    }

