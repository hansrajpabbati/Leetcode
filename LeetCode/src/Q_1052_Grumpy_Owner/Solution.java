package Q_1052_Grumpy_Owner;

/*
Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
Output: 16
Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
 */

/*
[4,10,10]
[1,1,0]
2
 * */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int[] customers = {1,0,1,2,1,1,7,5};
		//		int[] grumpy = {0,1,0,1,0,1,0,1};
		//		int x = 3;

		int[] customers = {4,10,10};
		int[] grumpy = {1,1,0};
		int x = 2;


		int ans = maxSatisfied(customers, grumpy, x);

		//		System.out.println(customers[customers.length-1]);
		System.out.println(ans);


	}
	public static int maxSatisfied(int[] customers, int[] grumpy, int x) {

		int sum =0;
		int total =0;

		for(int i=0 ; i< customers.length ;i++) {
			total += customers[i]* (1-grumpy[i]);
		}
		System.out.println("total is "+total);

		for(int i=0; i < customers.length - x;i++) {
			if(grumpy[i] == 0) {
				sum +=customers[i];
			}
		}


		return sum;


	}



	//	public static int maxSatisfied(int[] customers, int[] grumpy, int x) {
	//		
	//		int sum =0;
	//		
	//		for(int i=0 ; i< x;i++) {
	//			sum += customers[customers.length-1-i];
	//		}
	//		System.out.println(sum);
	//		
	//		for(int j=0; j < grumpy.length - x;j++) {
	//			if(grumpy[j] == 0) {
	//				sum +=customers[j];
	//			}
	//		}
	//		
	//		
	//		return sum;
	//
	//
	//	}

}
