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
	public static int maxSatisfied(int[] customers, int[] grumpy, int X) {

		int left=0; // left pointer 
		int ncustomers = 0;
		int addlCustomers = 0;
		int alreadySatisfiedCustomers = 0;  // customers that will be satisfied if we make the owner not grumpy    
		for(int right=0; right < customers.length; right++)
		{
			// customers that are satisfied because owner is not grumpy
			alreadySatisfiedCustomers += grumpy[right] == 0 ? customers[right]:0;
			if(right-left+1 <= X)
			{ // window size less than X   
				ncustomers += grumpy[right] == 1? customers[right]:0;
				addlCustomers = Math.max(addlCustomers, ncustomers);   
			}else if(right-left+1 > X)
			{ 
				// window size > than X
				// remove the customers who were satisfied when we marked grumpy left as not grumpy
				ncustomers -= grumpy[left] == 1? customers[left]:0;
				// add the customers that got satisfied when we mark grumpy right as not grumpy
				ncustomers += grumpy[right] == 1? customers[right]:0;
				// keep track of additional satisfied customers
				addlCustomers = Math.max(addlCustomers, ncustomers); 
				left++;
			}
		}
		// last window is not processed in the for loop above
		addlCustomers = Math.max(addlCustomers, ncustomers); 
		return alreadySatisfiedCustomers+addlCustomers;        
	}





//	public static int maxSatisfied1(int[] customers, int[] grumpy, int x) {
//
//		int sum =0;
//		int total =0;
//
//		for(int i=0 ; i< customers.length ;i++) {
//			total += customers[i]* (1-grumpy[i]);
//		}
//		System.out.println("total is "+total);
//
//		for(int i=0; i < customers.length-x;i++) {
//			int incr = SatisfiedCustomers(customers, grumpy, i, i + x - 1);
//			if (incr > sum) {
//				sum = incr;}
//
//		}
//
//
//		return sum+total;
//
//
//	}
//
//	public static int SatisfiedCustomers(int[] customers, int[] grumpy, int start, int end) {
//		int modified = 0;
//		int original = 0;
//		for (int i = start; i <=end; i++) {
//			modified += customers[i];
//			original += customers[i] * (1 - grumpy[i]);
//		}
//		return modified - original;
//	}



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
