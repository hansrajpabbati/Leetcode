package Q_1_Two_Sum;

import java.util.HashMap;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  nums = {2, 7, 11, 15};
		int target = 9;
		int [] sol = twoSum(nums, target);
		
		System.out.println(sol[0] + " " + sol[1]);


	}

	public static int[] twoSum(int[] nums, int target) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] sol = new int[2];
		
		for(int i=0; i< nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				sol[1] = i;
				sol[0] = map.get(target-nums[i]);
				return sol;
//				System.out.println(map.get(target-nums[i]) + "here");
				
			}else {
				map.put(nums[i], i);
			}
		}
		
		return sol;
	}

}
