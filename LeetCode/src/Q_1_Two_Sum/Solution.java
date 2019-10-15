package Q_1_Two_Sum;

//Leetcode 1 Two Sum

/*Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {2, 7, 11, 15};
		int target = 9;

		//		int [] nums = {3,2,3};
		//		int target = 6;

		int res[] = twoSum(nums, target);

		System.out.println(res[0] + " "+res[1]);

	}

	public static int[] twoSum(int[] nums, int target) {

		for(int i =0 ; i < nums.length;i++) {
			for(int j=i+1;j< nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					int [] res = {i,j};
					return res;
				}
			}
		}
		return null;
	}

}
