package algorithms;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        int index1=-1;
        int index2=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && (nums[i]+nums[j] == target)){
                    index1=i;
                    index2=j;
                }
            }
        }
        return new int[]{index1,index2};
    }
}
